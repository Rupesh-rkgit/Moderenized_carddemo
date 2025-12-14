package com.carddemo.batch.job.cbtrn02c;

import com.carddemo.core.domain.*;
import com.carddemo.core.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.data.RepositoryItemReader;
import org.springframework.batch.item.data.builder.RepositoryItemReaderBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.PlatformTransactionManager;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class DailyTransactionJobConfig {

    private final JobRepository jobRepository;
    private final PlatformTransactionManager transactionManager;
    private final DailyTransactionRepository dailyTransactionRepository;
    private final AccountRepository accountRepository;
    private final CardRepository cardRepository; // Assuming we need to check card status
    private final TransactionRepository transactionRepository;
    private final TransactionCategoryBalanceRepository transactionCategoryBalanceRepository;

    @Bean
    public Job dailyTransactionJob() {
        return new JobBuilder("cbtrn02cJob", jobRepository)
                .start(fileIngestStep())
                .next(transactionProcessingStep())
                .build();
    }

    // --- STEP 1: FILE INGEST ---

    @Bean
    public Step fileIngestStep() {
        return new StepBuilder("fileIngestStep", jobRepository)
                .<DailyTransaction, DailyTransaction>chunk(100, transactionManager)
                .reader(csvFileReader())
                .writer(stagingTableWriter())
                .build();
    }

    @Bean
    public FlatFileItemReader<DailyTransaction> csvFileReader() {
        return new FlatFileItemReaderBuilder<DailyTransaction>()
                .name("csvFileReader")
                .resource(new FileSystemResource("data/daily_transactions.csv")) // Assumes file location
                .delimited()
                .names("id", "type", "category", "source", "desc", "amount", "merchantId",
                       "merchantName", "merchantCity", "merchantZip", "cardNumber", "origTs", "procTs")
                .fieldSetMapper(new DailyTransactionFieldSetMapper())
                .build();
    }

    @Bean
    public ItemWriter<DailyTransaction> stagingTableWriter() {
        return dailyTransactionRepository::saveAll;
    }

    // --- STEP 2: PROCESSING ---

    @Bean
    public Step transactionProcessingStep() {
        return new StepBuilder("transactionProcessingStep", jobRepository)
                .<DailyTransaction, DailyTransactionResult>chunk(10, transactionManager)
                .reader(stagingTableReader())
                .processor(transactionProcessor())
                .writer(transactionHistoryWriter())
                .build();
    }

    @Bean
    public RepositoryItemReader<DailyTransaction> stagingTableReader() {
        return new RepositoryItemReaderBuilder<DailyTransaction>()
                .name("stagingTableReader")
                .repository(dailyTransactionRepository)
                .methodName("findByValidationStatus")
                .arguments(java.util.Collections.singletonList("PENDING"))
                .sorts(Map.of("dailyTransactionId", Sort.Direction.ASC))
                .build();
    }

    @Bean
    public ItemProcessor<DailyTransaction, DailyTransactionResult> transactionProcessor() {
        return dailyTran -> {
            log.debug("Processing Daily Tran: {}", dailyTran.getDailyTransactionId());

            // 1. Look up Card (Check validity)
            Optional<Card> cardOpt = cardRepository.findById(dailyTran.getDailyTransactionCardNumber());
            if (cardOpt.isEmpty()) {
                dailyTran.setValidationStatus("REJECTED");
                dailyTran.setRejectReason("Card not found");
                return new DailyTransactionResult(dailyTran, null);
            }
            Card card = cardOpt.get();

            // 2. Look up Account
            Optional<Account> accountOpt = accountRepository.findById(card.getAccountId());
            if (accountOpt.isEmpty()) {
                dailyTran.setValidationStatus("REJECTED");
                dailyTran.setRejectReason("Account not found");
                return new DailyTransactionResult(dailyTran, null);
            }
            Account account = accountOpt.get();

            // 3. Validation: Credit Limit Check
            BigDecimal newBalance = account.getAccountCurrentBalance().add(dailyTran.getDailyTransactionAmount());
            if (newBalance.compareTo(account.getAccountCreditLimit()) > 0) {
                dailyTran.setValidationStatus("REJECTED");
                dailyTran.setRejectReason("Overlimit transaction");
                return new DailyTransactionResult(dailyTran, null);
            }

            // 4. Update Account Balance (In memory, write in writer)
            account.setAccountCurrentBalance(newBalance);
            accountRepository.save(account);

            // 5. Update Transaction Category Balance
            TransactionCategoryBalanceId catKey = new TransactionCategoryBalanceId();
            catKey.setTransactionCategoryAccountId(account.getAccountId());
            catKey.setTransactionCategoryTypeCode(dailyTran.getDailyTransactionType());
            catKey.setTransactionCategoryCode(dailyTran.getDailyTransactionCategory());

            TransactionCategoryBalance catBal = transactionCategoryBalanceRepository.findById(catKey)
                    .orElseGet(() -> {
                        TransactionCategoryBalance newBal = new TransactionCategoryBalance();
                        newBal.setTransactionCategoryAccountId(account.getAccountId());
                        newBal.setTransactionCategoryTypeCode(dailyTran.getDailyTransactionType());
                        newBal.setTransactionCategoryCode(dailyTran.getDailyTransactionCategory());
                        newBal.setTransactionCategoryBalance(BigDecimal.ZERO);
                        return newBal;
                    });

            catBal.setTransactionCategoryBalance(catBal.getTransactionCategoryBalance().add(dailyTran.getDailyTransactionAmount()));
            transactionCategoryBalanceRepository.save(catBal);

            // 6. Create History Record
            Transaction tran = new Transaction();
            tran.setTransactionId(dailyTran.getDailyTransactionId());
            tran.setTransactionTypeCode(dailyTran.getDailyTransactionType());
            tran.setTransactionCategoryCode(dailyTran.getDailyTransactionCategory());
            tran.setTransactionSource(dailyTran.getDailyTransactionSource());
            tran.setTransactionDescription(dailyTran.getDailyTransactionDescription());
            tran.setTransactionAmount(dailyTran.getDailyTransactionAmount());
            tran.setTransactionMerchantId(dailyTran.getDailyTransactionMerchantId());
            tran.setTransactionMerchantName(dailyTran.getDailyTransactionMerchantName());
            tran.setTransactionMerchantCity(dailyTran.getDailyTransactionMerchantCity());
            tran.setTransactionMerchantZip(dailyTran.getDailyTransactionMerchantZip());
            tran.setTransactionCardNumber(dailyTran.getDailyTransactionCardNumber());
            tran.setTransactionOriginalTimestamp(dailyTran.getDailyTransactionOriginalTimestamp());

            String procTs = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss.SSSSS"));
            tran.setTransactionProcessTimestamp(procTs);

            // Mark as Processed
            dailyTran.setValidationStatus("PROCESSED");
            dailyTran.setDailyTransactionProcessTimestamp(procTs);

            return new DailyTransactionResult(dailyTran, tran);
        };
    }

    @Bean
    public ItemWriter<DailyTransactionResult> transactionHistoryWriter() {
        return items -> {
            for (DailyTransactionResult item : items) {
                dailyTransactionRepository.save(item.getDailyTransaction());
                if (item.getTransaction() != null) {
                    transactionRepository.save(item.getTransaction());
                }
            }
        };
    }
}

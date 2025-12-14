package com.carddemo.batch.job.cbact04c;

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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.PlatformTransactionManager;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class InterestCalculatorJobConfig {

    private final JobRepository jobRepository;
    private final PlatformTransactionManager transactionManager;
    private final TransactionCategoryBalanceRepository transactionCategoryBalanceRepository;
    private final AccountRepository accountRepository;
    private final DisclosureGroupRepository disclosureGroupRepository;
    private final CardCrossReferenceRepository cardCrossReferenceRepository;
    private final TransactionRepository transactionRepository;

    @Bean
    public Job interestCalculatorJob() {
        return new JobBuilder("cbact04cJob", jobRepository)
                .start(interestCalculatorStep())
                .build();
    }

    @Bean
    public Step interestCalculatorStep() {
        return new StepBuilder("interestCalculatorStep", jobRepository)
                .<TransactionCategoryBalance, InterestCalculationResult>chunk(10, transactionManager)
                .reader(transactionCategoryBalanceReader())
                .processor(interestProcessor())
                .writer(interestWriter())
                .build();
    }

    @Bean
    public RepositoryItemReader<TransactionCategoryBalance> transactionCategoryBalanceReader() {
        return new RepositoryItemReaderBuilder<TransactionCategoryBalance>()
                .name("transactionCategoryBalanceReader")
                .repository(transactionCategoryBalanceRepository)
                .methodName("findAll")
                .sorts(Map.of("transactionCategoryAccountId", Sort.Direction.ASC))
                .build();
    }

    @Bean
    public ItemProcessor<TransactionCategoryBalance, InterestCalculationResult> interestProcessor() {
        return item -> {
            log.debug("Processing TCB for Account: {}", item.getTransactionCategoryAccountId());

            // 1. Get Account
            Optional<Account> accountOpt = accountRepository.findById(item.getTransactionCategoryAccountId());
            if (accountOpt.isEmpty()) {
                log.warn("Account not found: {}", item.getTransactionCategoryAccountId());
                return null;
            }
            Account account = accountOpt.get();

            // 2. Get Disclosure Group (Interest Rate)
            Optional<DisclosureGroup> disGroupOpt = disclosureGroupRepository
                    .findByAccountGroupIdAndTransactionTypeCodeAndTransactionCategoryCode(
                            account.getAccountGroupId(),
                            item.getTransactionCategoryTypeCode(),
                            item.getTransactionCategoryCode());

            BigDecimal interestRate = BigDecimal.ZERO;
            if (disGroupOpt.isPresent()) {
                interestRate = disGroupOpt.get().getInterestRate();
            } else {
                 Optional<DisclosureGroup> defaultDisGroup = disclosureGroupRepository
                     .findByAccountGroupIdAndTransactionTypeCodeAndTransactionCategoryCode(
                         "DEFAULT",
                         item.getTransactionCategoryTypeCode(),
                         item.getTransactionCategoryCode());
                 if(defaultDisGroup.isPresent()){
                     interestRate = defaultDisGroup.get().getInterestRate();
                 }
            }

            if (interestRate.compareTo(BigDecimal.ZERO) == 0) {
                return null; // No interest to calculate
            }

            // 3. Compute Interest
            BigDecimal monthlyInterest = item.getTransactionCategoryBalance()
                    .multiply(interestRate)
                    .divide(new BigDecimal("1200"), MathContext.DECIMAL128);

            // Update Account Balance Object (Do not save yet)
            account.setAccountCurrentBalance(account.getAccountCurrentBalance().add(monthlyInterest));

            // 4. Create Transaction Record
            Transaction tran = new Transaction();

            // Use UUID to ensure uniqueness
            String tranId = java.util.UUID.randomUUID().toString().substring(0, 16);
            tran.setTransactionId(tranId);

            tran.setTransactionTypeCode("01");
            tran.setTransactionCategoryCode(5);
            tran.setTransactionSource("System");
            tran.setTransactionDescription("Int. for a/c " + account.getAccountId());
            tran.setTransactionAmount(monthlyInterest);
            tran.setTransactionMerchantId(0);

            // Lookup Card Number
            var xrefs = cardCrossReferenceRepository.findByXrefAccountId(item.getTransactionCategoryAccountId());
            if (!xrefs.isEmpty()) {
                tran.setTransactionCardNumber(xrefs.get(0).getXrefCardNumber());
            } else {
                tran.setTransactionCardNumber("");
            }

            String ts = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss.SSSSS"));
            tran.setTransactionOriginalTimestamp(ts);
            tran.setTransactionProcessTimestamp(ts);

            return new InterestCalculationResult(account, tran);
        };
    }

    @Bean
    public ItemWriter<InterestCalculationResult> interestWriter() {
        return items -> {
            for (InterestCalculationResult item : items) {
                accountRepository.save(item.getAccount());
                transactionRepository.save(item.getTransaction());
            }
        };
    }
}

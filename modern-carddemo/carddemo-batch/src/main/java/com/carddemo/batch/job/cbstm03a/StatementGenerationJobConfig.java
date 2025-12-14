package com.carddemo.batch.job.cbstm03a;

import com.carddemo.core.domain.Account;
import com.carddemo.core.domain.Customer;
import com.carddemo.core.domain.CardCrossReference;
import com.carddemo.core.domain.Transaction;
import com.carddemo.core.repository.AccountRepository;
import com.carddemo.core.repository.CardCrossReferenceRepository;
import com.carddemo.core.repository.CustomerRepository;
import com.carddemo.core.repository.TransactionRepository;
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
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class StatementGenerationJobConfig {

    private final JobRepository jobRepository;
    private final PlatformTransactionManager transactionManager;
    private final AccountRepository accountRepository;
    private final CustomerRepository customerRepository;
    private final CardCrossReferenceRepository cardCrossReferenceRepository;
    private final TransactionRepository transactionRepository; // Assuming we can find transactions

    @Bean
    public Job statementGenerationJob() {
        return new JobBuilder("cbstm03aJob", jobRepository)
                .start(statementGenerationStep())
                .build();
    }

    @Bean
    public Step statementGenerationStep() {
        return new StepBuilder("statementGenerationStep", jobRepository)
                .<Account, StatementData>chunk(10, transactionManager)
                .reader(accountReader())
                .processor(statementProcessor())
                .writer(statementWriter())
                .build();
    }

    @Bean
    public RepositoryItemReader<Account> accountReader() {
        return new RepositoryItemReaderBuilder<Account>()
                .name("accountReader")
                .repository(accountRepository)
                .methodName("findAll")
                .sorts(Map.of("accountId", Sort.Direction.ASC))
                .build();
    }

    @Bean
    public ItemProcessor<Account, StatementData> statementProcessor() {
        return account -> {
            log.debug("Processing Statement for Account: {}", account.getAccountId());

            // 1. Find Customer via XREF
            // Legacy logic: Read XREF by AccountID (which assumes index), then Read Customer
            List<CardCrossReference> xrefs = cardCrossReferenceRepository.findByXrefAccountId(account.getAccountId());
            if (xrefs.isEmpty()) {
                log.warn("No Card XREF found for account {}", account.getAccountId());
                return null;
            }
            // Taking the first card xref
            CardCrossReference xref = xrefs.get(0);

            Optional<Customer> customerOpt = customerRepository.findById(xref.getXrefCustomerId());
            if (customerOpt.isEmpty()) {
                log.warn("Customer not found for ID {}", xref.getXrefCustomerId());
                return null;
            }
            Customer customer = customerOpt.get();

            // 2. Fetch Transactions
            List<Transaction> transactions = transactionRepository.findByTransactionCardNumber(xref.getXrefCardNumber());

            StatementData data = new StatementData();
            data.setAccount(account);
            data.setCustomer(customer);
            data.setTransactions(transactions); // This needs to be filtered

            return data;
        };
    }

    @Bean
    public ItemWriter<StatementData> statementWriter() {
        return items -> {
            TemplateEngine templateEngine = new TemplateEngine();
            ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
            resolver.setPrefix("templates/");
            resolver.setSuffix(".html");
            templateEngine.setTemplateResolver(resolver);

            for (StatementData data : items) {
                Context context = new Context();
                context.setVariable("account", data.getAccount());
                context.setVariable("customer", data.getCustomer());
                context.setVariable("transactions", data.getTransactions()); // Filtered list

                String htmlContent = templateEngine.process("statement", context);

                // Write to file
                String filename = "statement_" + data.getAccount().getAccountId() + ".html";
                try (FileWriter writer = new FileWriter(filename)) {
                    writer.write(htmlContent);
                } catch (IOException e) {
                    log.error("Failed to write statement file", e);
                }
            }
        };
    }
}

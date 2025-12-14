package com.carddemo.api.service;

import com.carddemo.api.dto.BillPaymentDto;
import com.carddemo.core.domain.Account;
import com.carddemo.core.domain.Transaction;
import com.carddemo.core.repository.AccountRepository;
import com.carddemo.core.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BillPaymentService {

    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;

    @Transactional
    public Optional<String> payBill(BillPaymentDto paymentDto) {
        Optional<Account> accountOpt = accountRepository.findById(paymentDto.getAccountId());
        if (accountOpt.isEmpty()) {
            return Optional.empty();
        }
        Account account = accountOpt.get();

        // Deduct balance
        account.setAccountCurrentBalance(account.getAccountCurrentBalance().subtract(paymentDto.getAmount()));
        accountRepository.save(account);

        // Create Transaction
        Transaction tran = new Transaction();
        tran.setTransactionId(UUID.randomUUID().toString().substring(0, 16));
        tran.setTransactionTypeCode("02"); // Bill Payment
        tran.setTransactionCategoryCode(0);
        tran.setTransactionSource("ONLINE");
        tran.setTransactionDescription("Bill Payment");
        tran.setTransactionAmount(paymentDto.getAmount().negate()); // Payment reduces balance
        // Merchant fields N/A
        String ts = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss.SSSSS"));
        tran.setTransactionOriginalTimestamp(ts);
        tran.setTransactionProcessTimestamp(ts);

        transactionRepository.save(tran);

        return Optional.of(tran.getTransactionId());
    }
}

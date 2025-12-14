package com.carddemo.batch.job.cbact04c;

import com.carddemo.core.domain.Account;
import com.carddemo.core.domain.Transaction;
import lombok.Data;

@Data
public class InterestCalculationResult {
    private Account account;
    private Transaction transaction;

    public InterestCalculationResult(Account account, Transaction transaction) {
        this.account = account;
        this.transaction = transaction;
    }
}

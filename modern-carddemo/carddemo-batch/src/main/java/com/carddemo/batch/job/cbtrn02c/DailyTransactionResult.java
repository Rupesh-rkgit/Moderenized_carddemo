package com.carddemo.batch.job.cbtrn02c;

import com.carddemo.core.domain.DailyTransaction;
import com.carddemo.core.domain.Transaction;
import lombok.Data;

@Data
public class DailyTransactionResult {
    private DailyTransaction dailyTransaction;
    private Transaction transaction;

    public DailyTransactionResult(DailyTransaction dailyTransaction, Transaction transaction) {
        this.dailyTransaction = dailyTransaction;
        this.transaction = transaction;
    }
}

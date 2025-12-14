package com.carddemo.batch.job.cbstm03a;

import com.carddemo.core.domain.Account;
import com.carddemo.core.domain.Customer;
import com.carddemo.core.domain.Transaction;
import lombok.Data;
import java.util.List;

@Data
public class StatementData {
    private Account account;
    private Customer customer;
    private List<Transaction> transactions;
}

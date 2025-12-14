package com.carddemo.core.domain;

import lombok.Data;
import java.io.Serializable;

@Data
public class TransactionCategoryBalanceId implements Serializable {
    private Long transactionCategoryAccountId;
    private String transactionCategoryTypeCode;
    private Integer transactionCategoryCode;
}

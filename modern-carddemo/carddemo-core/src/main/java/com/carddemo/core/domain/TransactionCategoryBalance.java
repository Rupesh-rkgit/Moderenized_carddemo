package com.carddemo.core.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "TRAN_CAT_BAL")
@IdClass(TransactionCategoryBalanceId.class)
public class TransactionCategoryBalance {

    @Id
    @Column(name = "TRANCAT_ACCT_ID", nullable = false)
    private Long transactionCategoryAccountId;

    @Id
    @Column(name = "TRANCAT_TYPE_CD", length = 2, nullable = false)
    private String transactionCategoryTypeCode;

    @Id
    @Column(name = "TRANCAT_CD", nullable = false)
    private Integer transactionCategoryCode;

    @Column(name = "TRAN_CAT_BAL", precision = 11, scale = 2)
    private BigDecimal transactionCategoryBalance;
}

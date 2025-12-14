package com.carddemo.core.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "TRANSACTION")
public class Transaction {

    @Id
    @Column(name = "TRAN_ID", length = 16, nullable = false)
    private String transactionId;

    @Column(name = "TRAN_TYPE_CD", length = 2)
    private String transactionTypeCode;

    @Column(name = "TRAN_CAT_CD")
    private Integer transactionCategoryCode;

    @Column(name = "TRAN_SOURCE", length = 10)
    private String transactionSource;

    @Column(name = "TRAN_DESC", length = 100)
    private String transactionDescription;

    @Column(name = "TRAN_AMT", precision = 11, scale = 2)
    private BigDecimal transactionAmount;

    @Column(name = "TRAN_MERCHANT_ID")
    private Integer transactionMerchantId;

    @Column(name = "TRAN_MERCHANT_NAME", length = 50)
    private String transactionMerchantName;

    @Column(name = "TRAN_MERCHANT_CITY", length = 50)
    private String transactionMerchantCity;

    @Column(name = "TRAN_MERCHANT_ZIP", length = 10)
    private String transactionMerchantZip;

    @Column(name = "TRAN_CARD_NUM", length = 16)
    private String transactionCardNumber;

    @Column(name = "TRAN_ORIG_TS", length = 26)
    private String transactionOriginalTimestamp;

    @Column(name = "TRAN_PROC_TS", length = 26)
    private String transactionProcessTimestamp;
}

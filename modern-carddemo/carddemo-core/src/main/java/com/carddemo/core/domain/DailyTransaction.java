package com.carddemo.core.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "DAILY_TRANSACTION")
public class DailyTransaction {

    @Id
    @Column(name = "DALYTRAN_ID", length = 16, nullable = false)
    private String dailyTransactionId;

    @Column(name = "DALYTRAN_TYPE_CD", length = 2)
    private String dailyTransactionType;

    @Column(name = "DALYTRAN_CAT_CD")
    private Integer dailyTransactionCategory;

    @Column(name = "DALYTRAN_SOURCE", length = 10)
    private String dailyTransactionSource;

    @Column(name = "DALYTRAN_DESC", length = 100)
    private String dailyTransactionDescription;

    @Column(name = "DALYTRAN_AMT", precision = 11, scale = 2)
    private BigDecimal dailyTransactionAmount;

    @Column(name = "DALYTRAN_MERCHANT_ID")
    private Integer dailyTransactionMerchantId;

    @Column(name = "DALYTRAN_MERCHANT_NAME", length = 50)
    private String dailyTransactionMerchantName;

    @Column(name = "DALYTRAN_MERCHANT_CITY", length = 50)
    private String dailyTransactionMerchantCity;

    @Column(name = "DALYTRAN_MERCHANT_ZIP", length = 10)
    private String dailyTransactionMerchantZip;

    @Column(name = "DALYTRAN_CARD_NUM", length = 16)
    private String dailyTransactionCardNumber;

    @Column(name = "DALYTRAN_ORIG_TS", length = 26)
    private String dailyTransactionOriginalTimestamp;

    @Column(name = "DALYTRAN_PROC_TS", length = 26)
    private String dailyTransactionProcessTimestamp;

    @Column(name = "DALYTRAN_STATUS", length = 20)
    private String validationStatus; // PENDING, PROCESSED, REJECTED

    @Column(name = "DALYTRAN_REJECT_REASON", length = 100)
    private String rejectReason;
}

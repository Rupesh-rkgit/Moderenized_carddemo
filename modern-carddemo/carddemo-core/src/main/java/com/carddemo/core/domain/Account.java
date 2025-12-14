package com.carddemo.core.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @Column(name = "ACCT_ID", nullable = false)
    private Long accountId;

    @Column(name = "ACCT_ACTIVE_STATUS", length = 1)
    private String accountActiveStatus;

    @Column(name = "ACCT_CURR_BAL", precision = 12, scale = 2)
    private BigDecimal accountCurrentBalance;

    @Column(name = "ACCT_CREDIT_LIMIT", precision = 12, scale = 2)
    private BigDecimal accountCreditLimit;

    @Column(name = "ACCT_CASH_CREDIT_LIMIT", precision = 12, scale = 2)
    private BigDecimal accountCashCreditLimit;

    @Column(name = "ACCT_OPEN_DATE")
    private java.time.LocalDate accountOpenDate;

    @Column(name = "ACCT_EXPIRATION_DATE")
    private java.time.LocalDate accountExpirationDate;

    @Column(name = "ACCT_REISSUE_DATE")
    private java.time.LocalDate accountReissueDate;

    @Column(name = "ACCT_CURR_CYC_CREDIT", precision = 12, scale = 2)
    private BigDecimal accountCurrentCycleCredit;

    @Column(name = "ACCT_CURR_CYC_DEBIT", precision = 12, scale = 2)
    private BigDecimal accountCurrentCycleDebit;

    @Column(name = "ACCT_ADDR_ZIP", length = 10)
    private String accountAddressZip;

    @Column(name = "ACCT_GROUP_ID", length = 10)
    private String accountGroupId;
}

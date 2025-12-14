package com.carddemo.core.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "DISCLOSURE_GROUP")
@IdClass(DisclosureGroupId.class)
public class DisclosureGroup {

    @Id
    @Column(name = "DIS_ACCT_GROUP_ID", length = 10, nullable = false)
    private String accountGroupId;

    @Id
    @Column(name = "DIS_TRAN_TYPE_CD", length = 2, nullable = false)
    private String transactionTypeCode;

    @Id
    @Column(name = "DIS_TRAN_CAT_CD", nullable = false)
    private Integer transactionCategoryCode;

    @Column(name = "DIS_INT_RATE", precision = 6, scale = 2)
    private BigDecimal interestRate;
}

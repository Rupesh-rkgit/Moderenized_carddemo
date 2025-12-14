package com.carddemo.core.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CARD_XREF")
@IdClass(CardCrossReferenceId.class)
public class CardCrossReference {

    @Id
    @Column(name = "XREF_CARD_NUM", length = 16, nullable = false)
    private String xrefCardNumber;

    @Column(name = "XREF_CUST_ID")
    private Integer xrefCustomerId;

    @Column(name = "XREF_ACCT_ID")
    private Long xrefAccountId;
}

package com.carddemo.core.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CARD")
public class Card {

    @Id
    @Column(name = "CARD_NUM", length = 16, nullable = false)
    private String cardNumber;

    @Column(name = "CARD_ACCT_ID", nullable = false)
    private Long accountId;

    @Column(name = "CARD_CVV_CD")
    private Integer cardCvv;

    @Column(name = "CARD_EMBOSSED_NAME", length = 50)
    private String cardEmbossedName;

    @Column(name = "CARD_EXPIRAION_DATE", length = 10)
    private String cardExpirationDate;

    @Column(name = "CARD_ACTIVE_STATUS", length = 1)
    private String cardActiveStatus;
}

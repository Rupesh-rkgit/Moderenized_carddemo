package com.carddemo.core.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @Column(name = "CUST_ID", nullable = false)
    private Integer customerId;

    @Column(name = "CUST_FIRST_NAME", length = 25)
    private String customerFirstName;

    @Column(name = "CUST_MIDDLE_NAME", length = 25)
    private String customerMiddleName;

    @Column(name = "CUST_LAST_NAME", length = 25)
    private String customerLastName;

    @Column(name = "CUST_ADDR_LINE_1", length = 50)
    private String customerAddressLine1;

    @Column(name = "CUST_ADDR_LINE_2", length = 50)
    private String customerAddressLine2;

    @Column(name = "CUST_ADDR_LINE_3", length = 50)
    private String customerAddressLine3;

    @Column(name = "CUST_ADDR_STATE_CD", length = 2)
    private String customerAddressStateCode;

    @Column(name = "CUST_ADDR_COUNTRY_CD", length = 3)
    private String customerAddressCountryCode;

    @Column(name = "CUST_ADDR_ZIP", length = 10)
    private String customerAddressZip;

    @Column(name = "CUST_PHONE_NUM_1", length = 15)
    private String customerPhoneNum1;

    @Column(name = "CUST_PHONE_NUM_2", length = 15)
    private String customerPhoneNum2;

    @Column(name = "CUST_SSN")
    private Integer customerSsn;

    @Column(name = "CUST_GOVT_ISSUED_ID", length = 20)
    private String customerGovtIssuedId;

    @Column(name = "CUST_DOB_YYYY_MM_DD")
    private java.time.LocalDate customerDob;

    @Column(name = "CUST_EFT_ACCOUNT_ID", length = 10)
    private String customerEftAccountId;

    @Column(name = "CUST_PRI_CARD_HOLDER_IND", length = 1)
    private String customerPrimaryCardHolderIndicator;

    @Column(name = "CUST_FICO_CREDIT_SCORE")
    private Integer customerFicoCreditScore;
}

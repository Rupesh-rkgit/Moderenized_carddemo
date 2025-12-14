package com.carddemo.core.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "USRSEC")
public class User {

    @Id
    @Column(name = "SEC_USR_ID", length = 8, nullable = false)
    private String userId;

    @Column(name = "SEC_USR_FNAME", length = 20)
    private String userFirstName;

    @Column(name = "SEC_USR_LNAME", length = 20)
    private String userLastName;

    @Column(name = "SEC_USR_PWD", length = 8)
    private String userPassword;

    @Column(name = "SEC_USR_TYPE", length = 1)
    private String userType;

    @Column(name = "SEC_USR_FILLER", length = 23)
    private String userFiller;
}

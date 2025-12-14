package com.carddemo.api.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class AccountUpdateDto {
    private BigDecimal creditLimit;
    private BigDecimal cashCreditLimit;
    private LocalDate expirationDate;
    private LocalDate reissueDate;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressStateCode;
    private String addressZip;
    private String phoneNum1;
    private String phoneNum2;
}

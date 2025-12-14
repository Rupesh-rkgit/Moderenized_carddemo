package com.carddemo.api.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class AccountViewDto {
    private Long accountId;
    private BigDecimal currentBalance;
    private BigDecimal creditLimit;
    private LocalDate openDate;
    private LocalDate expirationDate;

    // Customer Info
    private String customerName;
    private String customerAddress;
    private String customerPhone;
}

package com.carddemo.api.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class AccountDto {
    private Long accountId;
    private BigDecimal balance;
    private BigDecimal creditLimit;
}

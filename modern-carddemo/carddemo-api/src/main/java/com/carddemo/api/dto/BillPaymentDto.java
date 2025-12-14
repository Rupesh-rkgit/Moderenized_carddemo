package com.carddemo.api.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class BillPaymentDto {
    private Long accountId;
    private BigDecimal amount;
}

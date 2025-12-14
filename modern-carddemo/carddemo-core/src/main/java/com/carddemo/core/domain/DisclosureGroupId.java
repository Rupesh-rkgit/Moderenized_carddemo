package com.carddemo.core.domain;

import lombok.Data;
import java.io.Serializable;

@Data
public class DisclosureGroupId implements Serializable {
    private String accountGroupId;
    private String transactionTypeCode;
    private Integer transactionCategoryCode;
}

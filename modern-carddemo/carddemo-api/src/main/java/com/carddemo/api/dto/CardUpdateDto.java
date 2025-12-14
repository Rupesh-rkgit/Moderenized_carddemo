package com.carddemo.api.dto;

import lombok.Data;

@Data
public class CardUpdateDto {
    private String embossedName;
    private String expirationDate;
    private String activeStatus;
}

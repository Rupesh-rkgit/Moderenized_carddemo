package com.carddemo.api.dto;

import lombok.Data;

@Data
public class UserDto {
    private String userId;
    private String firstName;
    private String lastName;
    private String userType;
}

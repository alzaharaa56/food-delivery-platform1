package com.example.food_delivery_platform.DTO.Request;

import lombok.Data;

@Data
public class CustomerRequestDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
}


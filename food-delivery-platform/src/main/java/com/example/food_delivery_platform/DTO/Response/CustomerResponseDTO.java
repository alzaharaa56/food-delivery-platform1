package com.example.food_delivery_platform.DTO.Response;

import lombok.Data;

@Data
public class CustomerResponseDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer loyaltyPoints;
    private Boolean isActive;
}


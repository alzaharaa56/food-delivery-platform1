package com.example.food_delivery_platform.DTO.Response;

import lombok.Data;

@Data
public class RestaurantOwnerResponseDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String businessLicenseCode;
    private Boolean isActive;
}


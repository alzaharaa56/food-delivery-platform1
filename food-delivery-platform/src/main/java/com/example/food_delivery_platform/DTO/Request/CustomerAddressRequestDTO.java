package com.example.food_delivery_platform.DTO.Request;

import lombok.Data;

@Data
public class CustomerAddressRequestDTO {
    private String street;
    private String city;
    private String building;
    private Boolean isDefault;
}


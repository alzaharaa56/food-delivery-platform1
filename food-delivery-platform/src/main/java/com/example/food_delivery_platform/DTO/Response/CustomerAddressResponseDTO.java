package com.example.food_delivery_platform.DTO.Response;


import lombok.Data;

@Data
public class CustomerAddressResponseDTO {
    private Integer id;
    private String street;
    private String city;
    private String building;
    private Boolean isDefault;
}


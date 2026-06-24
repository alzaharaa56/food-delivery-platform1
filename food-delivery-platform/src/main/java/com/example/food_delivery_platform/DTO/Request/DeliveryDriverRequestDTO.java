package com.example.food_delivery_platform.DTO.Request;


import lombok.Data;

@Data
public class DeliveryDriverRequestDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private String vehicleType;
    private String vehiclePlate;
}


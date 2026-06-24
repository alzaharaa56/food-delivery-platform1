package com.example.food_delivery_platform.DTO.Response;



import lombok.Data;

@Data
public class DeliveryDriverResponseDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String driverCode;
    private String vehicleType;
    private String vehiclePlate;
    private Boolean isOnline;
    private Boolean isActive;
}


package com.example.food_delivery_platform.DTO.Request;


import lombok.Data;

@Data
public class DeliveryRequestDTO {
    private Integer orderId;
    private Integer driverId;
    private String trackingCode;
    private String status;
}


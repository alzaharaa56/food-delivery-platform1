package com.example.food_delivery_platform.DTO.Request;

import lombok.Data;

import java.time.LocalTime;

@Data
public class RestaurantRequestDTO {
    private String name;
    private String description;
    private String cuisineType;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private Double minOrderAmount;
    private Double deliveryFee;
}


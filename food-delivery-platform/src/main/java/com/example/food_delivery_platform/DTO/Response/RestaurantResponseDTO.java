package com.example.food_delivery_platform.DTO.Response;

import lombok.Data;

@Data
public class RestaurantResponseDTO {
    private Integer id;
    private String name;
    private String description;
    private String cuisineType;
    private Double minOrderAmount;
    private Double deliveryFee;
    private Boolean acceptingOrders;
    private Boolean isActive;
}

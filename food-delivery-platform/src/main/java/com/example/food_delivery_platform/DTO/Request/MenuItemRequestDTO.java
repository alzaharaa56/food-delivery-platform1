package com.example.food_delivery_platform.DTO.Request;

import lombok.Data;

@Data
public class MenuItemRequestDTO {
    private String name;
    private String description;
    private Double price;
    private Boolean isAvailable;
    private Boolean isVegetarian;
    private Integer calories;
    private Integer restaurantId;
}


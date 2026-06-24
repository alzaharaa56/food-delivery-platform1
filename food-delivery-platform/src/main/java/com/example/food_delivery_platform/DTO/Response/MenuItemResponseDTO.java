package com.example.food_delivery_platform.DTO.Response;

import lombok.Data;

@Data
public class MenuItemResponseDTO {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Boolean isAvailable;
    private Boolean isVegetarian;
    private Integer calories;
    private Integer restaurantId;
}


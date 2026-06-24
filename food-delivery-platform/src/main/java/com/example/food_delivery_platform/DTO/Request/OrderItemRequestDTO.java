package com.example.food_delivery_platform.DTO.Request;


import lombok.Data;

@Data
public class OrderItemRequestDTO {
    private Integer menuItemId;
    private Integer quantity;
    private String specialInstructions;
}


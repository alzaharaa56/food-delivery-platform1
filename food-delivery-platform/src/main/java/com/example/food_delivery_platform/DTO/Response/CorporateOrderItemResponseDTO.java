package com.example.food_delivery_platform.DTO.Response;


import lombok.Data;

@Data
public class CorporateOrderItemResponseDTO {
    private Integer id;
    private Integer menuItemId;
    private Integer quantity;
    private Double unitPrice;
    private Double totalPrice;
    private String specialInstructions;
}


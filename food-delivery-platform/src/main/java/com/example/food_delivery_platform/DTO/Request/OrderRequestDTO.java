package com.example.food_delivery_platform.DTO.Request;

import lombok.Data;
import java.util.List;

@Data
public class OrderRequestDTO {
    private Integer customerId;
    private Integer restaurantId;
    private List<OrderItemRequestDTO> items;
    private String deliveryNotes;
}


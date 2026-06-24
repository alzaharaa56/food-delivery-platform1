package com.example.food_delivery_platform.DTO.Response;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderResponseDTO {
    private Integer id;
    private String orderCode;
    private LocalDateTime orderDate;
    private String status;
    private Double subtotal;
    private Double deliveryFee;
    private Double discountAmount;
    private Double totalAmount;
    private String deliveryNotes;
    private Integer customerId;
    private Integer restaurantId;
    private List<OrderItemResponseDTO> items;
}


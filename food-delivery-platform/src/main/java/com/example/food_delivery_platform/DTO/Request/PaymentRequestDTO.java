package com.example.food_delivery_platform.DTO.Request;



import lombok.Data;

@Data
public class PaymentRequestDTO {
    private Integer orderId;
    private String paymentMethod;   // CASH, CARD, ONLINE
    private Double amount;
}


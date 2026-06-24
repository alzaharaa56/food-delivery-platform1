package com.example.food_delivery_platform.DTO.Response;


import lombok.Data;
import java.time.LocalDateTime;

@Data
public class PaymentResponseDTO {
    private Integer id;
    private String paymentMethod;
    private String status;
    private Double amount;
    private String transactionRef;
    private LocalDateTime processedAt;
    private Integer orderId;
}


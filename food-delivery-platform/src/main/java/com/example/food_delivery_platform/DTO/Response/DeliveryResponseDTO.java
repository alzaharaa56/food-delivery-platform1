package com.example.food_delivery_platform.DTO.Response;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class DeliveryResponseDTO {
    private Integer id;
    private String trackingCode;
    private String status;
    private LocalDateTime assignedAt;
    private LocalDateTime pickedUpAt;
    private LocalDateTime deliveredAt;
    private Integer orderId;
    private Integer driverId;
}


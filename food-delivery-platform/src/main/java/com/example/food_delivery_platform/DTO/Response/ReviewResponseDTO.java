package com.example.food_delivery_platform.DTO.Response;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ReviewResponseDTO {
    private Integer id;
    private String targetType;   // RESTAURANT أو DRIVER
    private Integer rating;
    private String comment;
    private LocalDateTime createdAt;
    private Integer customerId;
    private Integer restaurantId;
    private Integer driverId;
}


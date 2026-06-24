package com.example.food_delivery_platform.DTO.Request;



import lombok.Data;

@Data
public class ReviewRequestDTO {
    private Integer customerId;
    private Integer restaurantId;
    private Integer driverId;
    private Integer rating;
    private String comment;
}


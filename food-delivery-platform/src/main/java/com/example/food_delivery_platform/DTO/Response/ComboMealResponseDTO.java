package com.example.food_delivery_platform.DTO.Response;

import lombok.Data;
import java.util.List;

@Data
public class ComboMealResponseDTO {
    private Integer id;
    private String comboName;
    private String description;
    private Double totalPrice;
    private Boolean isAvailable;
    private Integer restaurantId;
    private List<Integer> menuItemIds;
}


package com.example.food_delivery_platform.DTO.Request;

import lombok.Data;
import java.util.List;

@Data
public class ComboMealRequestDTO {
    private String comboName;
    private String description;
    private Double totalPrice;
    private Boolean isAvailable;
    private Integer restaurantId;
    private List<Integer> menuItemIds; // IDs للأصناف داخل الوجبة
}


package com.example.food_delivery_platform.DTO.Summary;

import com.example.food_delivery_platform.Entities.ComboMeal;
import lombok.Data;

@Data
public class ComboMealSummaryDTO {
    private String comboName;
    private Double totalPrice;

    public static ComboMealSummaryDTO toSummary(ComboMeal comboMeal) {
        ComboMealSummaryDTO dto = new ComboMealSummaryDTO();

        dto.setComboName(comboMeal.getComboName());
        dto.setTotalPrice(comboMeal.getTotalPrice());

        return dto;
    }
}


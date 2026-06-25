package com.example.food_delivery_platform.DTO.Response;
import com.example.food_delivery_platform.Entities.ComboMeal;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ComboMealResponseDTO {
    private String comboName;
    private String description;
    private Double totalPrice;

    public static ComboMealResponseDTO toResponse(ComboMeal comboMeal) {
        ComboMealResponseDTO dto = new ComboMealResponseDTO();

        dto.setComboName(comboMeal.getComboName());
        dto.setDescription(comboMeal.getDescription());
        dto.setTotalPrice(comboMeal.getTotalPrice());

        return dto;
    }

    public static List<ComboMealResponseDTO> toResponse(List<ComboMeal> comboMeals) {
        List<ComboMealResponseDTO> dtos = new ArrayList<>();

        for (ComboMeal entity : comboMeals) {
            dtos.add(toResponse(entity));
        }

        return dtos;
    }
}
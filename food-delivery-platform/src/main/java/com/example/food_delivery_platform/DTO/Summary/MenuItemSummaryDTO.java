package com.example.food_delivery_platform.DTO.Summary;

import com.example.food_delivery_platform.Entities.MenuItem;
import com.example.food_delivery_platform.Entities.Restaurant;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class MenuItemSummaryDTO {
    private String name;
    private Double price;

    public static MenuItemSummaryDTO toSummary(MenuItem menuItem) {
        MenuItemSummaryDTO dto = new MenuItemSummaryDTO();

        dto.setName(menuItem.getName());
        dto.setPrice(menuItem.getPrice());

        return dto;
    }

    public static List<MenuItemSummaryDTO> toSummary(List<MenuItem> items) {
        List<MenuItemSummaryDTO> dtos = new ArrayList<>();
        for (MenuItem entity : items) {
            dtos.add(toSummary(entity));
        }
        return dtos;
    }
}
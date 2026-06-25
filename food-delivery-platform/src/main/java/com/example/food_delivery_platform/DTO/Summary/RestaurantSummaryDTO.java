package com.example.food_delivery_platform.DTO.Summary;

import com.example.food_delivery_platform.DTO.Response.CustomerResponseDTO;
import com.example.food_delivery_platform.Entities.Customer;
import com.example.food_delivery_platform.Entities.Restaurant;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RestaurantSummaryDTO {
    private String name;
    private String cuisineType;

    public static RestaurantSummaryDTO toSummary(Restaurant restaurant) {
        RestaurantSummaryDTO dto = new RestaurantSummaryDTO();

        dto.setName(restaurant.getName());
        dto.setCuisineType(restaurant.getCuisineType());

        return dto;
    }
    public static List<RestaurantSummaryDTO> toSummary(List<Restaurant> restaurants) {
        List<RestaurantSummaryDTO> dtos = new ArrayList<>();
        for (Restaurant entity : restaurants) {
            dtos.add(toSummary(entity));
        }
        return dtos;
    }
}



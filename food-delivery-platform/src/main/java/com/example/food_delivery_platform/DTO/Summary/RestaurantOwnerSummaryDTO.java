package com.example.food_delivery_platform.DTO.Summary;

import com.example.food_delivery_platform.Entities.Customer;
import com.example.food_delivery_platform.Entities.RestaurantOwner;
import lombok.Data;

@Data
public class RestaurantOwnerSummaryDTO {
    private String fullName;

    public static RestaurantOwnerSummaryDTO toSummary( RestaurantOwner restaurantOwner) {
        RestaurantOwnerSummaryDTO dto = new RestaurantOwnerSummaryDTO();
        dto.setFullName(restaurantOwner.getFirstName()
                + " "
                + restaurantOwner.getLastName()
        );
        return dto;
    }


}

package com.example.food_delivery_platform.DTO.Response;


import com.example.food_delivery_platform.DTO.Summary.RestaurantOwnerSummaryDTO;
import com.example.food_delivery_platform.DTO.Summary.RestaurantSummaryDTO;
import com.example.food_delivery_platform.Entities.Customer;
import com.example.food_delivery_platform.Entities.RestaurantOwner;
import com.example.food_delivery_platform.Utilities.HelperUtils;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class RestaurantOwnerResponseDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private List<RestaurantSummaryDTO> restaurants;

    public static RestaurantOwnerResponseDTO toResponse(RestaurantOwner restaurantOwner) {
        RestaurantOwnerResponseDTO dto = new RestaurantOwnerResponseDTO();
        dto.setFirstName(restaurantOwner.getFirstName());
        dto.setLastName(restaurantOwner.getLastName());
        dto.setEmail(restaurantOwner.getEmail());
        dto.setPhone(restaurantOwner.getPhone());
        if(HelperUtils.isNotNull(restaurantOwner.getRestaurants())){
            dto.setRestaurants(
                    RestaurantSummaryDTO.toSummary(restaurantOwner.getRestaurants())
            );
        }
        return dto;
    }

    public static List<RestaurantOwnerResponseDTO> toResponse(List<RestaurantOwner> restaurantOwners) {
        List<RestaurantOwnerResponseDTO> dtos = new ArrayList<>();
        for (RestaurantOwner entity : restaurantOwners) {
            dtos.add(toResponse(entity));
        }
        return dtos;
    }


}


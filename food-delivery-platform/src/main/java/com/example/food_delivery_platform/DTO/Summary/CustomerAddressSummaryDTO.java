package com.example.food_delivery_platform.DTO.Summary;
import com.example.food_delivery_platform.DTO.Response.RestaurantResponseDTO;
import com.example.food_delivery_platform.Entities.Customer;
import com.example.food_delivery_platform.Entities.CustomerAddress;
import com.example.food_delivery_platform.Entities.Restaurant;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CustomerAddressSummaryDTO {

    private String address;

    public static CustomerAddressSummaryDTO toSummary(CustomerAddress address) {
        CustomerAddressSummaryDTO dto = new CustomerAddressSummaryDTO();
        dto.setAddress(address.getCity()
                + " , "
                + address.getStreet()
                + " , "
                + address.getBuilding()
        );
        return dto;
    }

    public static List<CustomerAddressSummaryDTO> toSummary(List<CustomerAddress> addresses) {
        List<CustomerAddressSummaryDTO> dtos = new ArrayList<>();

        for (CustomerAddress entity : addresses) {
            dtos.add(toSummary(entity));
        }

        return dtos;
    }
}


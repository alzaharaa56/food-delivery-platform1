package com.example.food_delivery_platform.DTO.Response;

import com.example.food_delivery_platform.Entities.Customer;
import com.example.food_delivery_platform.Entities.CustomerAddress;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class CustomerAddressResponseDTO {
    private String street;
    private String city;
    private String building;

    public static CustomerAddressResponseDTO toResponse(CustomerAddress customerAddress) {
        CustomerAddressResponseDTO dto = new CustomerAddressResponseDTO();
        dto.setStreet(customerAddress.getStreet());
        dto.setCity(customerAddress.getCity());
        dto.setBuilding(customerAddress.getBuilding());
        return dto;
    }

    public static List<CustomerAddressResponseDTO> toResponse(List<CustomerAddress> customerAddresses) {
        List<CustomerAddressResponseDTO> dtos = new ArrayList<>();
        for (CustomerAddress entity : customerAddresses) {
            dtos.add(toResponse(entity));
        }
        return dtos;
    }
}



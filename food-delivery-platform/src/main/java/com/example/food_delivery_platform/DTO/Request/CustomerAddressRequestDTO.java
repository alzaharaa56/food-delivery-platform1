package com.example.food_delivery_platform.DTO.Request;

import com.example.food_delivery_platform.Entities.Customer;
import com.example.food_delivery_platform.Entities.CustomerAddress;
import com.example.food_delivery_platform.Utilities.HelperUtils;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerAddressRequestDTO {
    @NotBlank
    private String street;
    @NotBlank
    private String city;
    @NotBlank
    private String building;

    public static CustomerAddress toEntity(CustomerAddressRequestDTO dto) {
        CustomerAddress customerAddress = new CustomerAddress();
        customerAddress.setStreet(dto.getStreet());
        customerAddress.setCity(dto.getCity());
        customerAddress.setBuilding(dto.getBuilding());
        return customerAddress;
    }
}


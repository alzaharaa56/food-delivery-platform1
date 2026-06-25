package com.example.food_delivery_platform.DTO.Request;

import com.example.food_delivery_platform.Entities.Customer;
import com.example.food_delivery_platform.Entities.CustomerAddress;
import com.example.food_delivery_platform.Utilities.HelperUtils;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class CustomerRequestDTO extends PersonDTO{

    public static Customer toEntity(CustomerRequestDTO dto) {
        Customer customer = new Customer();

        customer.setFirstName(dto.getFirstName());
        customer.setLastName(dto.getLastName());
        customer.setEmail(dto.getEmail());
        customer.setPhone(dto.getPhone());
        customer.setPasswordHash(dto.getPassword());

        if (HelperUtils.isNull(customer.getCustomerAddresses())) {
            customer.setCustomerAddresses(new ArrayList<>());
        }

        return customer;
    }
}


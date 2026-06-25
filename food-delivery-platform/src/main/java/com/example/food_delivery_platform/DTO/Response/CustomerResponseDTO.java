package com.example.food_delivery_platform.DTO.Response;

import com.example.food_delivery_platform.DTO.Summary.CustomerAddressSummaryDTO;
import com.example.food_delivery_platform.Entities.Customer;
import com.example.food_delivery_platform.Entities.CustomerAddress;
import com.example.food_delivery_platform.Entities.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponseDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Integer loyaltyPoints;
    private String customerCode;
    private List<CustomerAddressSummaryDTO> address;
    public static CustomerResponseDTO toResponse(Customer customer) {
        CustomerResponseDTO dto = new CustomerResponseDTO();
        dto.setFirstName(customer.getFirstName());
        dto.setLastName(customer.getLastName());
        dto.setEmail(customer.getEmail());
        dto.setPhone(customer.getPhone());
        dto.setLoyaltyPoints(customer.getLoyaltyPoints());
        dto.setCustomerCode(customer.getCustomerCode());
        dto.setAddress(CustomerAddressSummaryDTO.toSummary(customer.getCustomerAddresses()));

        return dto;
    }

    public static List<CustomerResponseDTO> toResponse(List<Customer> customers) {
        List<CustomerResponseDTO> dtos = new ArrayList<>();
        for (Customer entity : customers) {
            dtos.add(toResponse(entity));
        }
        return dtos;
    }

}




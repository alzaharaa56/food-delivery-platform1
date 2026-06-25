package com.example.food_delivery_platform.DTO.Summary;


import com.example.food_delivery_platform.Entities.Customer;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerSummaryDTO {
    private String fullName;
    private Integer loyaltyPoints;

    public static CustomerSummaryDTO toSummary(Customer customer) {
        CustomerSummaryDTO dto = new CustomerSummaryDTO();
        dto.setFullName(customer.getFirstName()
                + " "
                + customer.getLastName()
        );
        dto.setLoyaltyPoints(customer.getLoyaltyPoints());
        return dto;
    }


}



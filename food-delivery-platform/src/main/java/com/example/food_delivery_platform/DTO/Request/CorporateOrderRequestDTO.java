package com.example.food_delivery_platform.DTO.Request;
import lombok.Data;
import java.util.List;

@Data
public class CorporateOrderRequestDTO {
    private String companyName;
    private String costCenter;
    private Integer restaurantId;
    private List<CorporateOrderItemRequestDTO> items;
}


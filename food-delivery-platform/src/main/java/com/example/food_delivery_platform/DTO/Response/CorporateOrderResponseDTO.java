package com.example.food_delivery_platform.DTO.Response;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class CorporateOrderResponseDTO {
    private Integer id;
    private String corporateCode;
    private String companyName;
    private String costCenter;
    private LocalDateTime orderDate;
    private String status;
    private Double totalAmount;
    private Integer restaurantId;
    private List<CorporateOrderItemResponseDTO> items;
}


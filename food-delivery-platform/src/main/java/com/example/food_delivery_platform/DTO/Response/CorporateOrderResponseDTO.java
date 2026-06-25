package com.example.food_delivery_platform.DTO.Response;

import com.example.food_delivery_platform.DTO.Summary.OrderItemSummaryDTO;
import com.example.food_delivery_platform.Entities.CorporateOrder;
import com.example.food_delivery_platform.Entities.CustomerAddress;
import com.example.food_delivery_platform.Entities.OrderItem;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class CorporateOrderResponseDTO {
    private String companyName;
    private String status;
    private Double totalAmount;
    private List<OrderItemSummaryDTO> items;

    public static CorporateOrderResponseDTO toResponse(CorporateOrder order) {
        CorporateOrderResponseDTO dto = new CorporateOrderResponseDTO();
        dto.setCompanyName(order.getCompanyName());
        dto.setStatus(order.getStatus());
        dto.setTotalAmount(order.getTotalAmount());
        dto.setItems(OrderItemSummaryDTO.toSummary(order.getItems()));
        return dto;
    }

    public static List<CorporateOrderResponseDTO> toResponse(List<CorporateOrder> orders) {
        List<CorporateOrderResponseDTO> dtos = new ArrayList<>();
        for (CorporateOrder entity : orders) {
            dtos.add(toResponse(entity));
        }
        return dtos;
    }


}




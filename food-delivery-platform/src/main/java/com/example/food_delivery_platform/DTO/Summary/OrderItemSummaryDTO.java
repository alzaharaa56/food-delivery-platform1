package com.example.food_delivery_platform.DTO.Summary;
import com.example.food_delivery_platform.Entities.OrderItem;
import com.example.food_delivery_platform.Entities.Restaurant;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class OrderItemSummaryDTO {
    private Integer quantity;
    private Double totalPrice;

    public static OrderItemSummaryDTO toSummary(OrderItem orderItem) {
        OrderItemSummaryDTO dto = new OrderItemSummaryDTO();

        dto.setQuantity(orderItem.getQuantity());
        dto.setTotalPrice(orderItem.getTotalPrice());

        return dto;
    }

    public static List<OrderItemSummaryDTO> toSummary(List<OrderItem> items) {
        List<OrderItemSummaryDTO> dtos = new ArrayList<>();
        for (OrderItem entity : items) {
            dtos.add(toSummary(entity));
        }
        return dtos;
    }
}


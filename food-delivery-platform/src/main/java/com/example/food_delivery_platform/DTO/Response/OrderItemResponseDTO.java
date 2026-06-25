package com.example.food_delivery_platform.DTO.Response;

import com.example.food_delivery_platform.DTO.Summary.MenuItemSummaryDTO;
import com.example.food_delivery_platform.Entities.OrderItem;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class OrderItemResponseDTO {
    private Integer quantity;
    private Double unitPrice;
    private Double totalPrice;
    private String specialInstructions ;
    private MenuItemSummaryDTO menuItemSummaryDTO;

    public static OrderItemResponseDTO toResponse(OrderItem orderItem) {
        OrderItemResponseDTO dto = new OrderItemResponseDTO();

        dto.setQuantity(orderItem.getQuantity());
        dto.setUnitPrice(orderItem.getUnitPrice());
        dto.setTotalPrice(orderItem.getTotalPrice());
        dto.setSpecialInstructions(orderItem.getSpecialInstructions());

        if (orderItem.getMenuItem() != null) {
            dto.setMenuItemSummaryDTO(
                    MenuItemSummaryDTO.toSummary(orderItem.getMenuItem())
            );
        }

        return dto;
    }

    public static List<OrderItemResponseDTO> toResponse(List<OrderItem> orderItems) {
        List<OrderItemResponseDTO> dtos = new ArrayList<>();

        for (OrderItem entity : orderItems) {
            dtos.add(toResponse(entity));
        }

        return dtos;
    }

}


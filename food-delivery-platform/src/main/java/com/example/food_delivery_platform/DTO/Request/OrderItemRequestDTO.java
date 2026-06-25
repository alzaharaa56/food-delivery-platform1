package com.example.food_delivery_platform.DTO.Request;

import com.example.food_delivery_platform.Entities.MenuItem;
import com.example.food_delivery_platform.Entities.OrderItem;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemRequestDTO {
    @Min(value = 1)
    private Integer quantity;
    private String specialInstructions;
    @NotNull
    private MenuItemRequestDTO menuItemRequestDTO;

    public static OrderItem toEntity(OrderItemRequestDTO dto) {
        OrderItem orderItem = new OrderItem();

        orderItem.setQuantity(dto.getQuantity());
        orderItem.setSpecialInstructions(dto.getSpecialInstructions());

        if (dto.getMenuItemRequestDTO() != null) {
            orderItem.setMenuItem(
                    MenuItemRequestDTO.toEntity(dto.getMenuItemRequestDTO())
            );
        }

        return orderItem;
    }


}



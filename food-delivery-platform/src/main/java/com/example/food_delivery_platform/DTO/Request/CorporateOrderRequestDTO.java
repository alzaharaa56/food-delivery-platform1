package com.example.food_delivery_platform.DTO.Request;
import com.example.food_delivery_platform.Entities.CorporateOrder;
import com.example.food_delivery_platform.Entities.OrderItem;
import com.example.food_delivery_platform.Utilities.HelperUtils;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CorporateOrderRequestDTO {
    @NotBlank
    private String companyName;
    private List<OrderItemRequestDTO> items;

    public static CorporateOrder toEntity(CorporateOrderRequestDTO dto) {
        CorporateOrder corporateOrder = new CorporateOrder();
        corporateOrder.setCompanyName(dto.getCompanyName());
        List<OrderItem> items = new ArrayList<>();
        if (HelperUtils.isNotNull(dto.getItems()) ) {
            for (OrderItemRequestDTO itemDto : dto.getItems()) {
                items.add(OrderItemRequestDTO.toEntity(itemDto));
            }
        }

        corporateOrder.setItems(items);
        return corporateOrder;

    }

}



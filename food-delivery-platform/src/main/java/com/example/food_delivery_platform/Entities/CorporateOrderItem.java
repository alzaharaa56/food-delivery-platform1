package com.example.food_delivery_platform.Entities;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "corporate_order_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CorporateOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer quantity;
    private Double unitPrice;
    private Double totalPrice;
    private String specialInstructions;

    @ManyToOne
    @JoinColumn(name = "corporate_order_id")
    private CorporateOrder corporateOrder;

    @ManyToOne
    @JoinColumn(name = "menu_item_id")
    private MenuItem menuItem;
}


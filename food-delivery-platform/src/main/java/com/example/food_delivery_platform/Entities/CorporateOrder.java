package com.example.food_delivery_platform.Entities;



import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "corporate_orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CorporateOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String corporateCode;
    private String companyName;
    private String costCenter;
    private LocalDateTime orderDate;
    private String status;
    private Double totalAmount;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Boolean isActive = true;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "corporateOrder", cascade = CascadeType.ALL)
    private List<CorporateOrderItem> items;
}


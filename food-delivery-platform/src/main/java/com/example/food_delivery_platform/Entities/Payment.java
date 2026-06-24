package com.example.food_delivery_platform.Entities;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String paymentMethod;
    private String status;
    private Double amount;
    private String transactionRef;
    private LocalDateTime processedAt;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Boolean isActive = true;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;
}


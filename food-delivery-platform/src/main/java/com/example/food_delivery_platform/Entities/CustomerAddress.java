package com.example.food_delivery_platform.Entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "customer_addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String street;
    private String city;
    private String building;
    private Boolean isDefault;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}


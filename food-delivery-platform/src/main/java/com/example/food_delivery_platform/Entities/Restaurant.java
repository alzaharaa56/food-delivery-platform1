package com.example.food_delivery_platform.Entities;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "restaurants")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;
    private String cuisineType;

    private LocalTime openingTime;
    private LocalTime closingTime;
    private Double minOrderAmount;
    private Double deliveryFee;
    private Boolean acceptingOrders;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Boolean isActive = true;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private RestaurantOwner owner;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<MenuItem> menuItems;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<ComboMeal> comboMeals;
}


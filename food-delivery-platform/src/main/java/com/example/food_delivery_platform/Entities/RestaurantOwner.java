package com.example.food_delivery_platform.Entities;



import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "restaurant_owners")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private String phone;
    private String passwordHash;
    private String businessLicenseCode;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Boolean isActive = true;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Restaurant> restaurants;
}


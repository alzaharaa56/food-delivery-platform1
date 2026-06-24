package com.example.food_delivery_platform.Entities;



import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "delivery_drivers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryDriver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private String phone;
    private String passwordHash;
    private String driverCode;
    private String vehicleType;
    private String vehiclePlate;
    private Double currentLat;
    private Double currentLng;
    private Boolean isOnline;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Boolean isActive = true;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    private List<Delivery> deliveries;
}


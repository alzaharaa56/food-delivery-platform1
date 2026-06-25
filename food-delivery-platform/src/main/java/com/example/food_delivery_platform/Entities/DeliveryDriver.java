package com.example.food_delivery_platform.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Driver;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class DeliveryDriver extends Person{

    private String driverCode;
    private String vehicleType;
    private String vehiclePlate;
    private Double currentLat;
    private Double currentLng;
    private Boolean isOnline;
    @OneToMany
    private List<Delivery> deliveries;

}


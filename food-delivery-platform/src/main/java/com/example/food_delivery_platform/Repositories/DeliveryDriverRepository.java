package com.example.food_delivery_platform.Repositories;

import com.example.food_delivery_platform.Entities.DeliveryDriver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DeliveryDriverRepository extends JpaRepository<DeliveryDriver, Integer> {

    @Query("SELECT d FROM DeliveryDriver d WHERE d.isOnline = true AND d.isActive = true")
    List<DeliveryDriver> findOnlineDrivers();

    @Query("SELECT d FROM DeliveryDriver d WHERE d.vehicleType = :vehicleType AND d.isActive = true")
    List<DeliveryDriver> findByVehicleType(@Param("vehicleType") String vehicleType);

    @Query("SELECT d FROM DeliveryDriver d WHERE d.driverCode = :driverCode AND d.isActive = true")
    DeliveryDriver findByDriverCode(@Param("driverCode") String driverCode);
}


package com.example.food_delivery_platform.Repositories;

import com.example.food_delivery_platform.Entities.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {

    @Query("SELECT d FROM Delivery d WHERE d.status = :status AND d.isActive = true")
    List<Delivery> findByStatus(@Param("status") String status);

    @Query("SELECT d FROM Delivery d WHERE d.driver.id = :driverId AND d.isActive = true")
    List<Delivery> findByDriverId(@Param("driverId") Integer driverId);

    @Query("SELECT d FROM Delivery d WHERE d.assignedAt BETWEEN :start AND :end AND d.isActive = true")
    List<Delivery> findByAssignedAtBetween(@Param("start") LocalDateTime start,
                                           @Param("end") LocalDateTime end);
}


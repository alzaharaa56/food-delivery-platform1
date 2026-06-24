package com.example.food_delivery_platform.Repositories;

import com.example.food_delivery_platform.Entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

    @Query("SELECT p FROM Payment p WHERE p.status = :status AND p.isActive = true")
    List<Payment> findByStatus(@Param("status") String status);

    @Query("SELECT p FROM Payment p WHERE p.paymentMethod = :method AND p.isActive = true")
    List<Payment> findByPaymentMethod(@Param("method") String method);

    @Query("SELECT p FROM Payment p WHERE p.processedAt BETWEEN :start AND :end AND p.isActive = true")
    List<Payment> findByProcessedAtBetween(@Param("start") LocalDateTime start,
                                           @Param("end") LocalDateTime end);
}


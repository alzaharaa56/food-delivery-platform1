package com.example.food_delivery_platform.Repositories;

import com.example.food_delivery_platform.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT c FROM Customer c WHERE c.email = :email AND c.isActive = true")
    Optional<Customer> findByEmail(@Param("email") String email);

    @Query("SELECT c FROM Customer c WHERE c.loyaltyPoints >= :points AND c.isActive = true")
    List<Customer> findByLoyaltyPointsGreaterThanEqual(@Param("points") int points);

    @Query("SELECT c FROM Customer c WHERE c.createdDate BETWEEN :start AND :end AND c.isActive = true")
    List<Customer> findByRegistrationDateBetween(@Param("start") LocalDateTime start,
                                                 @Param("end") LocalDateTime end);
}


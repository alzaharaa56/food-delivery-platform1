package com.example.food_delivery_platform.Repositories;

import com.example.food_delivery_platform.Entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

    @Query("SELECT r FROM Review r WHERE r.restaurant.id = :restaurantId AND r.isActive = true")
    List<Review> findByRestaurantId(@Param("restaurantId") Integer restaurantId);

    @Query("SELECT r FROM Review r WHERE r.driver.id = :driverId AND r.isActive = true")
    List<Review> findByDriverId(@Param("driverId") Integer driverId);

    @Query("SELECT r FROM Review r WHERE r.customer.id = :customerId AND r.isActive = true")
    List<Review> findByCustomerId(@Param("customerId") Integer customerId);

    @Query("SELECT r FROM Review r WHERE r.rating >= :minRating AND r.isActive = true")
    List<Review> findByRatingGreaterThanEqual(@Param("minRating") Integer minRating);
}

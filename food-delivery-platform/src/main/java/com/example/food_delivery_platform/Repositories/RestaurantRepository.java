package com.example.food_delivery_platform.Repositories;

import com.example.food_delivery_platform.Entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

    @Query("SELECT r FROM Restaurant r WHERE LOWER(r.cuisineType) = LOWER(:cuisine) AND r.isActive = true")
    List<Restaurant> findByCuisineTypeIgnoreCase(@Param("cuisine") String cuisine);

    @Query("SELECT r FROM Restaurant r WHERE r.acceptingOrders = true AND r.isActive = true")
    List<Restaurant> findByAcceptingOrdersTrue();

    @Query("SELECT r FROM Restaurant r WHERE r.deliveryFee BETWEEN :minFee AND :maxFee AND r.isActive = true")
    List<Restaurant> findByDeliveryFeeBetween(@Param("minFee") Double minFee,
                                              @Param("maxFee") Double maxFee);
}


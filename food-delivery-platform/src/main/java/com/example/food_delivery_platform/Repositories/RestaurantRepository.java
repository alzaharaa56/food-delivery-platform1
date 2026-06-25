package com.example.food_delivery_platform.Repositories;
import com.example.food_delivery_platform.Entities.ComboMeal;
import com.example.food_delivery_platform.Entities.CustomerAddress;
import com.example.food_delivery_platform.Entities.MenuItem;
import com.example.food_delivery_platform.Entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

    @Query("SELECT r FROM Restaurant r where r.isActive = true AND r.cuisineType =:cuisineType")
    List<Restaurant>findByCuisineTypeIgnoreCase(String cuisineType);

    @Query("SELECT r FROM Restaurant r where r.isActive = true AND r.acceptingOrders = true")
    List<Restaurant>findByAcceptingOrdersTrue();

    @Query("SELECT r FROM Restaurant r WHERE r.isActive = true AND r.deliveryFee <= :fee")
    List<Restaurant>findByDeliveryFeeLessThanEqual(@Param("fee") double fee);

    @Query("SELECT r FROM Restaurant r WHERE r.isActive = true AND r.restaurantOwner.id = :ownerId")
    List<Restaurant>findByOwner(@Param("ownerId") Long ownerId);

    @Query("SELECT r FROM Restaurant r WHERE r.isActive = true AND r.name LIKE %:keyword% ")
    List<Restaurant> findByNameContainingIgnoreCase(String keyword);

    @Query("SELECT r FROM Restaurant r WHERE r.isActive = true")
    List<Restaurant> getAll();

    @Query("SELECT r.menuItems FROM Restaurant r WHERE r.id = :restaurantId")
    List<MenuItem> findMenuByRestaurantId(@Param("restaurantId") Integer restaurantId);

    @Query("SELECT r.comboMeals FROM Restaurant r WHERE r.id = :restaurantId")
    List<ComboMeal> findComboMealByRestaurantId(@Param("restaurantId") Integer restaurantId);







}


package com.example.food_delivery_platform.Repositories;

import com.example.food_delivery_platform.Entities.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {

    @Query("SELECT m FROM MenuItem m WHERE m.price BETWEEN :minPrice AND :maxPrice AND m.isActive = true")
    List<MenuItem> findByPriceBetween(@Param("minPrice") Double minPrice,
                                      @Param("maxPrice") Double maxPrice);

    @Query("SELECT m FROM MenuItem m WHERE m.isVegetarian = true AND m.isActive = true")
    List<MenuItem> findVegetarianItems();

    @Query("SELECT m FROM MenuItem m WHERE m.calories <= :maxCalories AND m.isActive = true")
    List<MenuItem> findByCaloriesLessThanEqual(@Param("maxCalories") Integer maxCalories);
}


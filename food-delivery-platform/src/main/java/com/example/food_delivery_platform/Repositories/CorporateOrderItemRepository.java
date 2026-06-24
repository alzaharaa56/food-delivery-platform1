package com.example.food_delivery_platform.Repositories;

import com.example.food_delivery_platform.Entities.CorporateOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CorporateOrderItemRepository extends JpaRepository<CorporateOrderItem, Integer> {

    @Query("SELECT coi FROM CorporateOrderItem coi WHERE coi.corporateOrder.id = :corporateOrderId AND coi.isActive = true")
    List<CorporateOrderItem> findByCorporateOrderId(@Param("corporateOrderId") Integer corporateOrderId);

    @Query("SELECT coi FROM CorporateOrderItem coi WHERE coi.menuItem.id = :menuItemId AND coi.isActive = true")
    List<CorporateOrderItem> findByMenuItemId(@Param("menuItemId") Integer menuItemId);
}


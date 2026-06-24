package com.example.food_delivery_platform.Repositories;

import com.example.food_delivery_platform.Entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

    @Query("SELECT i FROM OrderItem i WHERE i.order.id = :orderId AND i.isActive = true")
    List<OrderItem> findByOrderId(@Param("orderId") Integer orderId);

    @Query("SELECT i FROM OrderItem i WHERE i.menuItem.id = :menuItemId AND i.isActive = true")
    List<OrderItem> findByMenuItemId(@Param("menuItemId") Integer menuItemId);
}

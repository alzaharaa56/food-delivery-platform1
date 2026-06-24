package com.example.food_delivery_platform.Repositories;

import com.example.food_delivery_platform.Entities.CorporateOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface CorporateOrderRepository extends JpaRepository<CorporateOrder, Integer> {

    @Query("SELECT co FROM CorporateOrder co WHERE co.companyName = :companyName AND co.isActive = true")
    List<CorporateOrder> findByCompanyName(@Param("companyName") String companyName);

    @Query("SELECT co FROM CorporateOrder co WHERE co.orderDate BETWEEN :start AND :end AND co.isActive = true")
    List<CorporateOrder> findByOrderDateBetween(@Param("start") LocalDateTime start,
                                                @Param("end") LocalDateTime end);
}


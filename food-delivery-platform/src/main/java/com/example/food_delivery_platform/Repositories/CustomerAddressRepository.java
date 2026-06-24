package com.example.food_delivery_platform.Repositories;



import com.example.food_delivery_platform.Entities.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Integer> {

    @Query("SELECT a FROM CustomerAddress a WHERE a.city = :city AND a.isActive = true")
    List<CustomerAddress> findByCity(@Param("city") String city);
}


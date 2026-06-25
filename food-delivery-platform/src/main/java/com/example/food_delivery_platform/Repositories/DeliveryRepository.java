package com.example.food_delivery_platform.Repositories;

import com.example.food_delivery_platform.Entities.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository

public interface DeliveryRepository extends JpaRepository<Delivery , Integer> {

}

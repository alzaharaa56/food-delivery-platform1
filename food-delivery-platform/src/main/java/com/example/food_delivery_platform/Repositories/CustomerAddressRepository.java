package com.example.food_delivery_platform.Repositories;



import com.example.food_delivery_platform.Entities.Customer;
import com.example.food_delivery_platform.Entities.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress , Integer> {
    @Query("SELECT ca.customer FROM CustomerAddress ca WHERE ca.city = :city AND ca.isActive=true")
    List<Customer>findByCity(@Param("city") String city);

    @Query("SELECT ca FROM CustomerAddress ca WHERE ca.isActive=true AND ca.id=:id")
    CustomerAddress getById(@Param("id") Integer id);


}


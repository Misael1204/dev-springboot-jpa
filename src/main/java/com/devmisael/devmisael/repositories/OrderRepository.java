package com.devmisael.devmisael.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmisael.devmisael.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

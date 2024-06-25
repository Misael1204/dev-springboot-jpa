package com.devmisael.devmisael.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmisael.devmisael.entities.OrderItem;
import com.devmisael.devmisael.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}

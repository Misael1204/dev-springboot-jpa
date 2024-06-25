package com.devmisael.devmisael.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmisael.devmisael.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

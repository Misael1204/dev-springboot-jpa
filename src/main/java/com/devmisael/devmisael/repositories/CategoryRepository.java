package com.devmisael.devmisael.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmisael.devmisael.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

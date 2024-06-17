package com.devmisael.devmisael.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmisael.devmisael.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

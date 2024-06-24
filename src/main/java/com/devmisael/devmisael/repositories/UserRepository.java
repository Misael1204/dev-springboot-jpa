package com.devmisael.devmisael.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devmisael.devmisael.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

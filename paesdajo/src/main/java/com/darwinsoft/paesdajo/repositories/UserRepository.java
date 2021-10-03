package com.darwinsoft.paesdajo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darwinsoft.paesdajo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

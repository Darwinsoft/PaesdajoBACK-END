package com.darwinsoft.paesdajo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darwinsoft.paesdajo.entities.Client;

public interface UserRepository extends JpaRepository<Client, Long>{

}

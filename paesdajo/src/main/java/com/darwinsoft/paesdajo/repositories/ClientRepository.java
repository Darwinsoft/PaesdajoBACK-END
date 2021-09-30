package com.darwinsoft.paesdajo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darwinsoft.paesdajo.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}

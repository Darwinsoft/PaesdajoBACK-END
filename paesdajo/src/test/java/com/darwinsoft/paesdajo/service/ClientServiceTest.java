package com.darwinsoft.paesdajo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.darwinsoft.paesdajo.controllers.ClientController;
import com.darwinsoft.paesdajo.dto.ClientDTO;
import com.darwinsoft.paesdajo.entities.Client;
import com.darwinsoft.paesdajo.repositories.ClientRepository;

@SpringBootTest
public class ClientServiceTest {
	
	private Integer countClients;
	
	@Autowired
	private ClientController controller;
	
	@Autowired
	private ClientRepository repository;
	
	@Test
	void initTest() {
		List<Client> clients = repository.findAll();
		countClients = clients.size();
	}
	
	@Test
	void testFindAllMethod() {
		ResponseEntity<List<ClientDTO>> clients = controller.findAll();
		assertEquals(clients.getBody().size(), countClients);	
	}
}

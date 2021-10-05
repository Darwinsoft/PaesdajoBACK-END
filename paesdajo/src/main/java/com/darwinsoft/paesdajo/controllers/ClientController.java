package com.darwinsoft.paesdajo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darwinsoft.paesdajo.dto.ClientDTO;
import com.darwinsoft.paesdajo.service.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping(value = "/search")
	public ResponseEntity<List<ClientDTO>> findAll(){
		List<ClientDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/search/{id}")
	public ResponseEntity<Optional<ClientDTO>> findById(@PathVariable Long id){
		Optional<ClientDTO> list = service.findAll(id);
		return ResponseEntity.ok(list);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ClientDTO> create(@RequestBody ClientDTO client) {		
		try {
			ClientDTO list = service.create(client);
			return ResponseEntity.ok(list);
		} catch (Exception e) {
			System.out.print(e);
			throw e;
		}
	}
	
	@PostMapping("/update")
	public ResponseEntity<ClientDTO> update(@RequestBody ClientDTO client) {		
		try {
			ClientDTO list = service.update(client);
			return ResponseEntity.ok(list);
		} catch (Exception e) {
			System.out.print(e);
			throw e;
		}
	}
}

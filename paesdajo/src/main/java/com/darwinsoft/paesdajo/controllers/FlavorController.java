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

import com.darwinsoft.paesdajo.dto.FlavorDTO;
import com.darwinsoft.paesdajo.service.FlavorService;

@RestController
@RequestMapping(value = "/flavors")
public class FlavorController {
	
	@Autowired
	private FlavorService service;
	
	@GetMapping(value = "/search")
	public ResponseEntity<List<FlavorDTO>> findAll(){
		List<FlavorDTO> listFlavor = service.findAll();
		return ResponseEntity.ok(listFlavor);
	}
	
	@GetMapping(value = "/search/{id}")
	public ResponseEntity<Optional<FlavorDTO>> findById(@PathVariable Long id){
		Optional<FlavorDTO> flavor = service.findAll(id);
		return ResponseEntity.ok(flavor);
	}
	
	@PostMapping(value = "/create")
	public ResponseEntity<FlavorDTO> create(@RequestBody FlavorDTO flavor){
		FlavorDTO result = service.update(flavor);
		return ResponseEntity.ok(result);
	}
	
	@PostMapping(value = "/update")
	public ResponseEntity<FlavorDTO> update(@RequestBody FlavorDTO flavor){
		FlavorDTO result = service.update(flavor);
		return ResponseEntity.ok(result);
	}
}

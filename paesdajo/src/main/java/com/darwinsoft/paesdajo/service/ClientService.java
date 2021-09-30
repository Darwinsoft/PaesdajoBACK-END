package com.darwinsoft.paesdajo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darwinsoft.paesdajo.dto.ClientDTO;
import com.darwinsoft.paesdajo.entities.Client;
import com.darwinsoft.paesdajo.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> result = repository.findAll(); 
		return result.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}
}

package com.darwinsoft.paesdajo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darwinsoft.paesdajo.dto.ClientDTO;
import com.darwinsoft.paesdajo.entities.Client;
import com.darwinsoft.paesdajo.repositories.AndressRepository;
import com.darwinsoft.paesdajo.repositories.ClientRepository;
import com.darwinsoft.paesdajo.repositories.TelephoneRepository;
import com.darwinsoft.paesdajo.repositories.UserRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Autowired
	private AndressRepository andressRepository;
	
	@Autowired
	private TelephoneRepository telephoneRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		andressRepository.findAll();
		telephoneRepository.findAll();
		userRepository.findAll();
		
		List<Client> result = repository.findAll(); 
		return result.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}
}

package com.darwinsoft.paesdajo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darwinsoft.paesdajo.dto.ClientDTO;
import com.darwinsoft.paesdajo.entities.Andress;
import com.darwinsoft.paesdajo.entities.Client;
import com.darwinsoft.paesdajo.entities.Telephone;
import com.darwinsoft.paesdajo.entities.User;
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
	
	@Autowired(required=true)
	private ModelMapper mapper;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		
		List<Client> result = repository.findAll(); 
		return result.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public Optional<ClientDTO> findAll(Long id){		
		Optional<Client> result = repository.findById(id); 
		return result.map(x -> new ClientDTO(x));
	}
	
	@Transactional()
	public ClientDTO create(ClientDTO client){
		
		Client clientObj = mapper.map(client, Client.class);
		Client result = repository.save(clientObj);
		
		User user = result.getUser();
		user.setClients(result);
		user = userRepository.save(user);
		
		
		List<Andress> andress = clientObj.getAndress();
		List<Telephone> telephones = clientObj.getTelephones();
		
		for(Andress a : andress) {
			a.setClient(clientObj);			
			andressRepository.save(a);			
		}
		
		for(Telephone t : telephones) {
			t.setClient(clientObj);			
			telephoneRepository.save(t);			
		}
		
		
		return mapper.map(result, ClientDTO.class);
	}
	
	@Transactional()
	public ClientDTO update(ClientDTO client){
		
		Client clientObj = mapper.map(client, Client.class);
		
		User user = clientObj.getUser();
		user.setClients(clientObj);
		user = userRepository.save(user);
		
		Client result = repository.save(clientObj);
		
		List<Andress> andress = clientObj.getAndress();
		List<Telephone> telephones = clientObj.getTelephones();
		
		for(Andress a : andress) {
			a.setClient(clientObj);			
			andressRepository.save(a);			
		}
		
		for(Telephone t : telephones) {
			t.setClient(clientObj);			
			telephoneRepository.save(t);			
		}
		
		
		return mapper.map(result, ClientDTO.class);
	}
}

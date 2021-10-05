package com.darwinsoft.paesdajo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darwinsoft.paesdajo.dto.FlavorDTO;
import com.darwinsoft.paesdajo.entities.Flavor;
import com.darwinsoft.paesdajo.repositories.FlavorRepository;

@Service
public class FlavorService {
	
	@Autowired
	private FlavorRepository repository; 
	
	@Autowired(required = true)
	private ModelMapper mapper;
	
	@Transactional(readOnly = true)
	public List<FlavorDTO> findAll(){
		List<Flavor> result = repository.findAll();
		return result.stream().map(x -> new FlavorDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public Optional<FlavorDTO> findAll(Long id){
		Optional<Flavor> result = repository.findById(id);		
		return result.map(x -> new FlavorDTO(x));
	}
	
	public FlavorDTO update(FlavorDTO flavor) {
		Flavor flavorObj = mapper.map(flavor, Flavor.class);
		Flavor flavorResult = repository.save(flavorObj);
		return mapper.map(flavorResult, FlavorDTO.class);
	}
}

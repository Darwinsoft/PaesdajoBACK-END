package com.darwinsoft.paesdajo.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import com.darwinsoft.paesdajo.entities.Andress;
import com.darwinsoft.paesdajo.entities.Client;
import com.darwinsoft.paesdajo.entities.Telephone;

public class ClientDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	private List<AndressDTO> andress;
	private List<TelephoneDTO> telephones;
	private UserDTO user;
	
	public ClientDTO() {
	}
	
	public ClientDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public ClientDTO(Client client) {
		id = client.getId();
		name = client.getName();
		List<Andress> resultAndress = client.getAndress();
		andress = resultAndress.stream().map(x -> new AndressDTO(x)).collect(Collectors.toList());
		List<Telephone> resultTelephones = client.getTelephones();
		telephones = resultTelephones.stream().map(x -> new TelephoneDTO(x)).collect(Collectors.toList());
		user = new UserDTO(client.getUser());
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<AndressDTO> getAndress(){
		return andress;
	}
	
	public List<TelephoneDTO> getTelephones(){
		return telephones;
	}
	
	public UserDTO getUser() {
		return user;
	}
}

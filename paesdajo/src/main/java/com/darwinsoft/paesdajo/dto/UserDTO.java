package com.darwinsoft.paesdajo.dto;

import java.io.Serializable;
import java.util.List;

import com.darwinsoft.paesdajo.entities.User;

public class UserDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String cpf;
	
	
	public UserDTO() {
	}
	
	public UserDTO(Long id, String cpf) {
		this.id = id;
		this.cpf = cpf;
	}
	public UserDTO(User user) {
		id = user.getId();
		cpf = user.getCpf();		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}

package com.darwinsoft.paesdajo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer cpf;
	
	@OneToOne
	@JoinColumn(name = "clintId")
	private List<Client> clients = new ArrayList<>();
	
	public User() {
		
	}
	
	public User(Long id, Integer cpf, List<Client> clients) {
		this.id = id;
		this.cpf = cpf;
		this.clients = clients;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public List<Client> getClients() {
		return clients;
	}
}

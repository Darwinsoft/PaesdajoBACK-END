package com.darwinsoft.paesdajo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_telephone")
public class Telephone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String telephone;
	
	@ManyToOne
	@JoinColumn(name = "clientId")
	private Client client;
	
	public Telephone() {
		
	}
	
	public Telephone(Long id, String telephone, Client client) {
		this.id = id;
		this.telephone = telephone;
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Client getClients() {
		return client;
	}
	
	
}

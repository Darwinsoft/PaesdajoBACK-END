package com.darwinsoft.paesdajo.entities;

import java.util.ArrayList;
import java.util.List;

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
	@JoinColumn(name = "clintId")
	private List<Client> clients = new ArrayList<>();
	
	public Telephone() {
		
	}
	
	public Telephone(Long id, String telephone, List<Client> clients) {
		this.id = id;
		this.telephone = telephone;
		this.clients = clients;
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
	
	public List<Client> getClients() {
		return clients;
	}
	
	
}

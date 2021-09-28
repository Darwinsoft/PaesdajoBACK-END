package com.darwinsoft.paesdajo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "client")
	private List<Client> client = new ArrayList<>();
	
	@OneToMany(mappedBy = "telephone")
	private List<Telephone> telephones = new ArrayList<>();

	@OneToOne(mappedBy = "user")
	private List<User> users = new ArrayList<>();

	@OneToOne(mappedBy = "order")
	private List<Order> orders = new ArrayList<>();
	
	public Client() {
		
	}
	
	public Client(Long id, String name) {
		this.id = id;
		this.name = name;
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
}

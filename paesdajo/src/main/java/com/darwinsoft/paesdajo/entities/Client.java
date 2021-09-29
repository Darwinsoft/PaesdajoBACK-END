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
	private List<Andress> andress = new ArrayList<>();
	
	@OneToMany(mappedBy = "client")
	private List<Telephone> telephones = new ArrayList<>();

	@OneToOne(mappedBy = "client")
	private User user;

	@OneToMany(mappedBy = "client")
	private List<Order> orders = new ArrayList<>();
	
	public Client() {
		
	}

	public Client(Long id, String name, List<Andress> andress, List<Telephone> telephones, User user,
			List<Order> orders) {		
		this.id = id;
		this.name = name;
		this.andress = andress;
		this.telephones = telephones;
		this.user = user;
		this.orders = orders;
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

	public List<Andress> getAndress() {
		return andress;
	}

	public List<Telephone> getTelephones() {
		return telephones;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Order> getOrders() {
		return orders;
	}	
}

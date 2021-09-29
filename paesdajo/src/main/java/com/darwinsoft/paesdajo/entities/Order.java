package com.darwinsoft.paesdajo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double amount;
	
	@ManyToOne
	@JoinColumn(name = "clientId")
	private Client client;
	
	@OneToMany(mappedBy = "order")
	private List<OrderFlavor> orderFlavors= new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Long id, Double amount, Client client, List<OrderFlavor> orderFlavors) {
		this.id = id;
		this.amount = amount;
		this.client = client;		
		this.orderFlavors = orderFlavors;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<OrderFlavor> getOrderFlavors(){
		return orderFlavors;
	}
}

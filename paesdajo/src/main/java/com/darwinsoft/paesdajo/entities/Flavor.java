package com.darwinsoft.paesdajo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_flavor")
public class Flavor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double amount;
	
	@OneToMany(mappedBy = "flavor")
	private List<OrderFlavor> orderFlavors= new ArrayList<>();
	
	public Flavor() {
		
	}
	
	public Flavor(Long id, String name,Double amount, List<OrderFlavor> orderFlavors) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.orderFlavors = orderFlavors;
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

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<OrderFlavor> getOrderFlavors(){
		return orderFlavors;
	}
}

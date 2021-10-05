package com.darwinsoft.paesdajo.dto;

import java.io.Serializable;

import com.darwinsoft.paesdajo.entities.Flavor;

public class FlavorDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Double amount;
	
	
	public FlavorDTO() {
	}


	public FlavorDTO(Long id, String name, Double amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	public FlavorDTO(Flavor flavor) {
		id = flavor.getId();
		name = flavor.getName();
		amount = flavor.getAmount();
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


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}
}

package com.darwinsoft.paesdajo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_andress")
public class Andress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String andress;
	private Integer number;
	private String district;
	private String complement;
	
	@ManyToOne
	@JoinColumn(name = "clientId")
	private Client client;
	
	public Andress() {
		
	}

	public Andress(Long id, String andress, Integer number, String district, String complement, Client client) {
		this.id = id;
		this.andress = andress;
		this.number = number;
		this.district = district;
		this.complement = complement;
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAndress() {
		return andress;
	}

	public void setAndress(String andress) {
		this.andress = andress;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public Client getClient() {
		return client;
	}
}

package com.darwinsoft.paesdajo.dto;

import java.io.Serializable;

import com.darwinsoft.paesdajo.entities.Andress;
import com.darwinsoft.paesdajo.entities.Client;

public class AndressDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String andress;
	private Integer number;
	private String district;
	private String complement;
	
	public AndressDTO() {
	}

	public AndressDTO(Long id, String andress, Integer number, String district, String complement) {
		this.id = id;
		this.andress = andress;
		this.number = number;
		this.district = district;
		this.complement = complement;
	}
	
	public AndressDTO(Andress andress) {
		id = andress.getId();
		this.andress = andress.getAndress();
		number = andress.getNumber();
		district = andress.getDistrict();
		complement = andress.getComplement();		
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
	
}

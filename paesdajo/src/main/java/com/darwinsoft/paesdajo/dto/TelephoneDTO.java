package com.darwinsoft.paesdajo.dto;

import java.io.Serializable;

import com.darwinsoft.paesdajo.entities.Telephone;

public class TelephoneDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String telephone;
	
	public TelephoneDTO() {
		
	}

	public TelephoneDTO(Long id, String telephone) {
		this.id = id;
		this.telephone = telephone;
	}

	public TelephoneDTO(Telephone telephone) {
		id = telephone.getId();
		this.telephone = telephone.getTelephone();
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
	
	
}

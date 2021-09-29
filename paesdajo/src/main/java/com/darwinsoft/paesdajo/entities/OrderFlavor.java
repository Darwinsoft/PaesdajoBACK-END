package com.darwinsoft.paesdajo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_order_flavor")
public class OrderFlavor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	@ManyToOne
	@JoinColumn(name = "flavorId")
	private Flavor flavor;
	
	@ManyToOne
	@JoinColumn(name = "orderId")
	private Order order;
	
	public OrderFlavor() {
		
	}

	public OrderFlavor(Long id, Flavor flavor, Order order) {
		this.id = id;
		this.flavor = flavor;
		this.order = order;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Flavor getFlavor() {
		return flavor;
	}

	public Order getOrder() {
		return order;
	}
	
}

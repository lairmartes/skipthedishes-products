package com.github.lairmartes.hackaton.skipthedishes.products.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	/*
		id integer($int64)
		storeId integer($int64)
		name string
		description string
		price number($double)
	*/
	
	@Id
	@Column(nullable=false, updatable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long storeId;
	private String name;
	private String description;
	private double price;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getStoreId() {
		return storeId;
	}
	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}

package com.tcs.ecomAssignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_table")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="product name")
	private String name;
	
	@Column(name="product price")
	private double price;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

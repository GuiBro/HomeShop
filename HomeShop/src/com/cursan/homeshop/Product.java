package com.cursan.homeshop;

public class Product {
	private String name;
	private String description;
	private double price;
	
	public Product (String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public void look() {
		
	}
	
	public void buy() {
		
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

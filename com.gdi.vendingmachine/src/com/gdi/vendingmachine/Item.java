package com.gdi.vendingmachine;

public class Item {
	String name;
	public double price;
	boolean healthy;
	
	public Item(String name, double price, boolean healthy) {
		this.name = name;
		this.price = price;
		this.healthy = healthy;
	}
	
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	public boolean getHealthy() {
		return this.healthy;
	}
	public double setPrice(double price) {
		this.price = price;
		return this.price;
	}
}

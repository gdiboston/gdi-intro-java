package com.gdi.vendingmachine;

// machines have money and an array of items in them (inventory)
// create a constructor, getters and setters for each parameter

public class Machine {
	public double money;
	public Item[] inventory;
	
	public Machine() {
		money = 0;
		inventory = new Item[5];
	}
	
	public double getMoney() {
		return this.money;
	}
	public Item[] getInventory() {
		return this.inventory;
	}
	public double setMoney(double money) {
		this.money = money;
		return this.money;
	}
	
}

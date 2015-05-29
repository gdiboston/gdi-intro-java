package com.gdi.vendingmachine;

import java.util.Scanner;

public class UseMachine {
	
	public static void main(String[] args) {
		System.out.println("Building a new vending machine");
		
		// initialize new machine object
		Machine vendingMachine = new Machine();
		
		// make 10 items - 5 healthy, 5 not healthy
		Item apple = new Item("apple", 1.00, true);
		Item orange = new Item("orange", 1.25, true);
		Item pear = new Item("pear", .75, true);
		Item banana = new Item("banana", .50, true);
		Item yogurt = new Item("yogurt", 2, true);
		
		// put all the items into the vending machine
		vendingMachine.inventory[0] = apple;
		vendingMachine.inventory[1] = orange;
		vendingMachine.inventory[2] = pear;
		vendingMachine.inventory[3] = banana;
		vendingMachine.inventory[4] = orange;
		
		// now print what's available for the user to eat
		while(!checkIfEmpty(vendingMachine)) {
			printContents(vendingMachine.inventory);
			giveOptions(vendingMachine);
			takeAction(vendingMachine);
		}
	}
	
	public static void printContents(Item[] inventory) {
		for (int i = 0; i < inventory.length; i++) {
			if(inventory[i] != null) {
				System.out.println("     " + i + ": " + inventory[i].getName()+ " " + inventory[i].getPrice());
			}
			else {
				System.out.println("     " + i + ": -");
			}
		}
		System.out.println("");
	}
	
	public static void giveOptions(Machine vendingMachine) {
		System.out.println("0: Put money into machine");
		System.out.println("1: Purchase item");
		System.out.println("2: Check how much money is in machine");
		System.out.println("3: Return change");
		System.out.println("4: Turn off machine");
	}
	
	public static void takeAction(Machine vendingMachine) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		//check for valid input
		if (input.equals("0")) {
			// put money into machine
			putMoneyIntoMachine(vendingMachine);
		}
		else if (input.equals("1")) {
			purchase(vendingMachine);
		}
		else if (input.equals("2")) {
			System.out.println(vendingMachine.getMoney());
		}
		else if(input.equals("3")) {
			// return change
			returnChange(vendingMachine);
		}
		else if (input.equals("4")) {
			// turn off machine
			turnOffMachine();
		}
		else {
			System.out.println("Not a valid input");
		}
	}
	
	public static boolean purchase(Machine vendingMachine) {
		// current amount available to purchase things with
		System.out.println("What number item would you like?");
		Scanner s = new Scanner(System.in);
		int itemNumber = s.nextInt();
		Item currentItem = vendingMachine.inventory[itemNumber];
		
		// check if item exists
		if (vendingMachine.inventory[itemNumber] == null) {
			System.out.println("No item there!");
			return false;
		}
		
		// check if enough money for purchase
		if (checkIfEnoughMoney(itemNumber, vendingMachine)){
			System.out.println("Here's your " + currentItem.getName());
			// decrement money available 
			vendingMachine.setMoney(vendingMachine.getMoney() - currentItem.getPrice());
			System.out.println("You have " + vendingMachine.money + " remaining");

			// remove item from Inventory array
			vendingMachine.inventory[itemNumber] = null;
			return true;
		}
		else {
			System.out.println("Not enough money for that item!");
			return false;
		}
		
	}
	
	public static void putMoneyIntoMachine(Machine vendingMachine) {
		System.out.println("Input money please");
		Scanner scanner = new Scanner(System.in);
		double input = scanner.nextDouble();
		vendingMachine.setMoney(input);
		System.out.println("Machine has " + vendingMachine.getMoney() + " available");
	}
	
	public static boolean checkIfEnoughMoney(int itemNumber, Machine vendingMachine) {
		double moneyAvailable = vendingMachine.getMoney();
		Item[] inventory = vendingMachine.getInventory();
		double itemPrice = inventory[itemNumber].getPrice();
		if (moneyAvailable >= itemPrice) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void returnChange(Machine vendingMachine) {
		if(vendingMachine.getMoney() > 0){
			System.out.println("Returning $" + vendingMachine.getMoney());
			vendingMachine.setMoney(0);
		}
		else {
			System.out.println("No money in the machine");
		}
	}
	
	public static boolean checkIfEmpty(Machine vendingMachine) {
		for(int i = 0; i < vendingMachine.inventory.length; i++) {
			if (vendingMachine.inventory[i] != null) {
				return false;
			}
		}
		return true;
	}
	
	public static void turnOffMachine() {
		System.out.println("Goodbye");
		System.exit(0);
	}
}


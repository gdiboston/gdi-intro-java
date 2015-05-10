package com.gdi.vendingmachine;

import java.util.Scanner;

public class UseMachine {
	
	
	public static void main(String[] args) {
		System.out.println("Building a new vending machine");
		
		// initialize new machine object
		
		// make 5 items with prices and names
		
		// put all the items into the vending machine
		
		// now print what's available for the user to eat
		
		// while there are items in the vending machine take the following actions:
		// print the contents of the vending machine
		// give the user a list of options of what they can do
		// take the action the user has specified 
		
	}
	
	// method should iterate through the array and print out the items available
	// for purchase in the vending machine
	// be sure to account for the state when a space in the array doesn't have
	// an item for purchase
	public static void printContents(Item[] inventory) {
		
	}
	
	// give the user the following options:
	// 0: put money into the machine
	// 1: purchase an item from the machine
	// 2: check how much money is in the machine
	// 3: return change from the machine
	// 4: turn off the machine
	public static void giveOptions(Machine vendingMachine) {
	
	}
	
	// take the action the user specified they want to do in the "giveOptions" method
	// be sure to account for the state when a user enters an invalid number
	public static void takeAction(Machine vendingMachine) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		// the variable "input" is what the user typed into the console
		// check this variable to see if it matches any of the input
		// we outlined above 
		
	}
	
	// this method purchases an item from the vending machine
	// it should return TRUE if the item was purchased
	// it should return FALSE if the item was not purchased (item does not exist
	// or the vending machine didn't have enough money for the item)
	public static boolean purchase(Machine vendingMachine) {
		// current amount available to purchase things with
		System.out.println("What number item would you like?");
		Scanner s = new Scanner(System.in);
		int itemNumber = s.nextInt();
		Item currentItem = vendingMachine.inventory[itemNumber];
		
		// check if item exists
		// check if enough money for purchase
		// decrement money available 
		// remove item from Inventory array
	}
	
	// this method asks the user to input money
	// it uses the machine's setter method to add the money the user input to the
	// total amount of money that the machine has
	// it prints out the amount of money the vending machine has available 
	public static void putMoneyIntoMachine(Machine vendingMachine) {
		System.out.println("Input money please");
		Scanner scanner = new Scanner(System.in);
		double input = scanner.nextDouble();
		vendingMachine.setMoney(input);
		System.out.println("Machine has " + vendingMachine.getMoney() + " available");
	}
	
	// this method checks if there is enough money to purchase an item
	// it returns true if there is enough money, and false if there is not
	public static boolean checkIfEnoughMoney(int itemNumber, Machine vendingMachine) {
		
	}
	
	// this method returns the change left in the machine
	// if there is no change available, it tells the user that
	public static void returnChange(Machine vendingMachine) {
		
	}
	
	// this method checks if the vending machine has no more inventory. 
	// it returns false if there is inventory left in the machine
	// it returns true if the machine is empty
	public static boolean checkIfEmpty(Machine vendingMachine) {
		
	}
	
	// this method shuts off the machine and ends the program
	public static void turnOffMachine() {
		System.out.println("Goodbye");
		System.exit(0);
	}
}


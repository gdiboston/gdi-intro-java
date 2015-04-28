package com.gdi.oop;

import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {
		
		boolean isFull;
		int numberPassengers = 0;
		int maxNumberPassengers = 8;
		
		
		// example of a for loop
		for (int i = 0; i <= 50; i = i + 10) {
			System.out.println("I'm going " + i + " mph!");
		}
		
		// example of a while loop
		isFull = (numberPassengers >= maxNumberPassengers);
		System.out.println("number of passengers before loop: " + numberPassengers);
		while (!isFull) {
			numberPassengers++;
			System.out.println("number of passengers: " + numberPassengers);
			isFull = (numberPassengers >= maxNumberPassengers);
		}
		System.out.println("Is Full!");
		
		
		
		
		// examples of String
		String typeOfCar= "Honda Accord";
		
		System.out.println("Length: " + typeOfCar.length());
		System.out.println("Does the word contain 'vette'?" +
				typeOfCar.contains("vette"));
		System.out.println("It's all lower " + typeOfCar.toLowerCase());        
		System.out.println("It's all upper " + typeOfCar.toUpperCase());

		
		
		// this is how you would fill a second array with information
		// about the first array
		String[] garage = new String[3];
		garage[0] = "Chevy";
		garage[1] = "Ford";
		garage[2] = "Pontiac";
		
		boolean[] isAFord = new boolean[garage.length];
		
		for (int k = 0; k < garage.length; k++){
		        if (garage[k].equals("Ford")) {
		            isAFord[k] = true;
		        } else {
		            isAFord[k] = false;
		        }
		}
		
		// this is how you would print an array without looping through it.
		System.out.println("Is a Ford array: " + Arrays.toString(isAFord));
		System.out.println("Garage array: " + Arrays.toString(garage));
		
		// We will call our method
		String myCar = "Honda";
		boolean isMyCarInGarage = myCarIsInMyGarage(myCar, garage);
		
		if (!isMyCarInGarage) {
			// replace THE LAST car in the garage with my car
			garage[garage.length - 1] = myCar;
			System.out.println("Garage array: " + Arrays.toString(garage));
		}
		// now we can check again to see if our car is in the garage.
		isMyCarInGarage = myCarIsInMyGarage(myCar, garage);
	}
	
	/*
	 * This method returns a boolean
	 * it has two parameters, a String and a String Array
	 * It loops over all the cars in my garage and as soon
	 * as we find a car in the garage that matches my car, 
	 * we can answer the question = my car is in my garage.
	 * If we never find my car in my garage, we return false;
	 */
	private static boolean myCarIsInMyGarage(String myCar, String[] myGarage) {
		for (int i = 0; i < myGarage.length; i++) {
			if (myCar.equals(myGarage[i])) {
				System.out.println("Your car (" + myCar + ") is in the garage!");
				return true;
			}
		}
		// now that we have checked the whole loop and never reached
		// the return statement, we can safely say that our car is
		// definitely not in the garage.
		System.out.println("Your car (" + myCar + ") is not in the garage.");
		return false;
	}

}

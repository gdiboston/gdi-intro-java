package com.gdi.class3;

public class HelloWorld {
	
	public static void main(String[] args){
		
		int speedLimit = 50;
		
		Car myFirstCar = new Car(5, 4, "6959 EO", "Honda Civic");
		
		System.out.println("LicensePlate: " +myFirstCar.licensePlate);
		System.out.println("Type: " +myFirstCar.type);
		System.out.println("IsFull: " + myFirstCar.isFull);
		System.out.println("NumberPassengers: " +myFirstCar.numberPassengers);
		
		while (myFirstCar.addAPassenger()) {
			System.out.println("NumberPassengers: " + myFirstCar.numberPassengers);
		}
		System.out.println("IsFull: " + myFirstCar.isFull);
		
		myFirstCar.graduallyChangeSpeed(60);
		System.out.println("I am speeding: " + myFirstCar.iAmSpeeding(speedLimit));
		myFirstCar.graduallyChangeSpeed(speedLimit);
		System.out.println("I am speeding: " + myFirstCar.iAmSpeeding(speedLimit));
		
	}
	
}

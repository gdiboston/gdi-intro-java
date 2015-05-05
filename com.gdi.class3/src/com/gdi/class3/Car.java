package com.gdi.class3;

public class Car {
	
	public int maxNumberPassengers;
	
	public int numberDoors;
	
	public int speed;
	
	public boolean isFull;
	
	public int numberPassengers;
	
	public String licensePlate;
	
	public String type;
	
	public Car(int maxNumberPassengers, int numberDoors, String licensePlate, String type) {
		speed = 0;
		isFull = false;
		numberPassengers = 0;
		
		this.maxNumberPassengers = maxNumberPassengers;
		this.numberDoors = numberDoors;
		this.licensePlate = licensePlate;
		this.type = type;
		
		
	}
	
	public boolean addAPassenger() {
		if ( !isFull ) {
			numberPassengers++;
			isFull = numberPassengers == maxNumberPassengers;
			return true;
		}
		return false;
	}
	
	public boolean iAmSpeeding(int speedLimit) {
		return speed > speedLimit;
	}
	
	public void graduallyChangeSpeed(int newSpeed) {
		if (speed > newSpeed) {
			while (speed > newSpeed) {
				System.out.println("My Speed: " + speed);
				speed = speed - 5;
			}
		} else if (speed < newSpeed) {
			while (speed < newSpeed) {
				System.out.println("My Speed: " + speed);
				speed = speed + 5;
			}
		}
		System.out.println("My Final Speed: " + speed);
	}

}

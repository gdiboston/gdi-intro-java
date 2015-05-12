package gdi.com.vehicles;

public class MotorVehicle {

	private static int countCreated = 0;
	private boolean engineOn;
	private int speed;
	private int numCurrentPassengers;
	private int maxNumberPassengers;
	
	public MotorVehicle(int maxNumberPassengers) {
		this.engineOn = false;
		this.speed = 0;
		this.numCurrentPassengers = 0;
		this.maxNumberPassengers = maxNumberPassengers;
		countCreated++;
	}
	
	
	public static int getCountCreated() {
		return countCreated;
	}



	public static void setCountCreated(int countCreated) {
		MotorVehicle.countCreated = countCreated;
	}



	public boolean isEngineOn() {
		return engineOn;
	}



	public void setEngineOn(boolean engineOn) {
		this.engineOn = engineOn;
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public int getNumCurrentPassengers() {
		return numCurrentPassengers;
	}



	public void setNumCurrentPassengers(int numCurrentPassengers) {
		this.numCurrentPassengers = numCurrentPassengers;
	}



	public int getMaxNumberPassengers() {
		return maxNumberPassengers;
	}



	public void setMaxNumberPassengers(int maxNumberPassengers) {
		this.maxNumberPassengers = maxNumberPassengers;
	}



	public void accelerate() {
		speed = speed + 5;
	}
	
	public void decelerate() {
		speed = speed - 5;
	}
	
	public void switchEngineState() {
		engineOn = !engineOn;
	}
	
	public void addPassenger() {
		numCurrentPassengers++;
	}
	
	public void removePassenger() {
		numCurrentPassengers--;
	}
	
	public void printDescription() {
		System.out.println("I'm a MotorVehicle and my engine is on: " + engineOn);
		System.out.println("I have " + numCurrentPassengers + " number of passengers");
		System.out.println("I am going " + speed + " mph");
	}
}

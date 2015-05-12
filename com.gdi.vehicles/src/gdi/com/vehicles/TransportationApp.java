package gdi.com.vehicles;

public class TransportationApp {

	public static void main(String[] args) {

		System.out.println(MotorVehicle.getCountCreated());
		
		MotorVehicle myCar = new MotorVehicle(5);
		myCar.printDescription();
		myCar.switchEngineState();
		myCar.addPassenger();
		myCar.accelerate();
		myCar.printDescription();
		
		//System.out.println(myCar.getNumCurrentPassengers());
		
		MotorVehicle mySecondCar = new MotorVehicle(12);
		
		System.out.println(MotorVehicle.getCountCreated());
		
	}
	

}

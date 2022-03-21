package n3exercici1;

import n3exercici1_commands.Brake;
import n3exercici1_commands.SpeedUp;
import n3exercici1_commands.StartEngine;
import n3exercici1_vehicles.Vehicle;
import n3exercici1_vehicles.VehicleFactory;

public class MainParking {

	public static void main(String[] args) {
	
		// Creamos una fábrica de vehículos para practicar con el patrón "Factory".
		
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		Vehicle car1 = vehicleFactory.getVehicle("car");
		Vehicle bicycle1 = vehicleFactory.getVehicle("bicycle");
		Vehicle boat1 = vehicleFactory.getVehicle("boat");
		Vehicle plane1 = vehicleFactory.getVehicle("plane");
		
		// Creamos los comandos StartEngine.
		
		StartEngine startCar = new StartEngine(car1);
		StartEngine startBicycle = new StartEngine(bicycle1);
		StartEngine startBoat = new StartEngine(boat1);
		StartEngine startPlane = new StartEngine(plane1);
		
		// Creamos los comandos SpeedUp.
		
		SpeedUp speedUpCar = new SpeedUp(car1);
		SpeedUp speedUpBicycle = new SpeedUp(bicycle1);
		SpeedUp speedUpBoat = new SpeedUp(boat1);
		SpeedUp speedUpPlane = new SpeedUp(plane1);
		
		// Creamos los comandos Brake.
		
		Brake brakeCar = new Brake(car1);
		Brake brakeBicycle = new Brake(bicycle1);
		Brake brakeBoat = new Brake(boat1);
		Brake brakePlane = new Brake(plane1);
		
		ParkingDriver driver1 = new ParkingDriver();
		
		// Lanzamos los "órdenes" de los comandos que debe realizar el ParkingDriver.
		
		driver1.takeDrivingCommand(startPlane);
		driver1.takeDrivingCommand(startCar);
		driver1.takeDrivingCommand(startBoat);
		driver1.takeDrivingCommand(startBicycle);
		
		driver1.takeDrivingCommand(speedUpPlane);
		driver1.takeDrivingCommand(speedUpCar);
		driver1.takeDrivingCommand(speedUpBoat);
		driver1.takeDrivingCommand(speedUpBicycle);
		
		driver1.takeDrivingCommand(brakePlane);
		driver1.takeDrivingCommand(brakeCar);
		driver1.takeDrivingCommand(brakeBoat);
		driver1.takeDrivingCommand(brakeBicycle);
		
		driver1.executeAllDrivingCommands();
		
	}

}

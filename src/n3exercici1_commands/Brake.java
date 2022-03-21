package n3exercici1_commands;

import n3exercici1_vehicles.Vehicle;

public class Brake implements DrivingCommand {

	private Vehicle vehicle;
	
	public Brake(Vehicle vehicle) {
		
		this.vehicle = vehicle;
		
	}
	
	@Override
	public void execute() {
		
		vehicle.brake();
		
	}

}

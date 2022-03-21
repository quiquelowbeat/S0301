package n3exercici1_commands;

import n3exercici1_vehicles.Vehicle;

public class StartEngine implements DrivingCommand {
	
	private Vehicle vehicle;
	
	public StartEngine(Vehicle vehicle) {
		
		this.vehicle = vehicle;
		
	}
	
	@Override
	public void execute() {
		
		vehicle.startEngine();
		
	}
	
}

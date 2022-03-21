package n3exercici1_commands;

import n3exercici1_vehicles.Vehicle;

public class SpeedUp implements DrivingCommand {

	private Vehicle vehicle;
	
	public SpeedUp(Vehicle vehicle) {
		
		this.vehicle = vehicle;
		
	}	
	
	@Override
	public void execute() {
		
		vehicle.speedUp();
		
	}

}

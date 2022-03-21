package n3exercici1;

import java.util.ArrayList;

import n3exercici1_commands.DrivingCommand;

public class ParkingDriver {
	
	ArrayList<DrivingCommand> drivingCommandList = new ArrayList<DrivingCommand>();
	
	public void takeDrivingCommand(DrivingCommand drive) {
		
		drivingCommandList.add(drive);
		
	}
	
	public void executeAllDrivingCommands() {
		
		drivingCommandList.forEach(drive -> drive.execute());
		drivingCommandList.clear();
		
	}
	
}

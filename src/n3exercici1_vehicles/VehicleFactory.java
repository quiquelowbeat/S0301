package n3exercici1_vehicles;

public class VehicleFactory {
	
	public Vehicle getVehicle(String vehicleType) {
	
		if(vehicleType == null) {
			
			return null;
			
		} else if(vehicleType.equalsIgnoreCase("BOAT")) {
			
			return new Boat();
			
		} else if(vehicleType.equalsIgnoreCase("PLANE")) {
			
			return new Plane();
			
		} else if (vehicleType.equalsIgnoreCase("CAR")) {
			
			return new Car();
			
		} else if (vehicleType.equalsIgnoreCase("BICYCLE")) {
			
			return new Bicycle();
			
		}
		
		return null;
		
	}

}

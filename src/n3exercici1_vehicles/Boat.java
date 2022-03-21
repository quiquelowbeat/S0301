package n3exercici1_vehicles;

public class Boat implements Vehicle {

	@Override
	public void startEngine() {
		
		System.out.println("Arrancando barco.");
		
	}

	@Override
	public void speedUp() {
		
		System.out.println("Acelerando barco.");
		
	}

	@Override
	public void brake() {
		
		System.out.println("Frenando el barco.");
		
	}

}

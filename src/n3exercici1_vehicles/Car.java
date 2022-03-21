package n3exercici1_vehicles;

public class Car implements Vehicle {

	@Override
	public void startEngine() {
		
		System.out.println("Arrancando coche.");
		
	}

	@Override
	public void speedUp() {
		
		System.out.println("Pisando acelerador.");
		
	}

	@Override
	public void brake() {
		
		System.out.println("Frenando el coche.");
		
	}

}

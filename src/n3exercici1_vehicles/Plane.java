package n3exercici1_vehicles;

public class Plane implements Vehicle {

	@Override
	public void startEngine() {
		
		System.out.println("Arrancando avión y rezando.");
		
	}

	@Override
	public void speedUp() {
		
		System.out.println("El avión coge velocidad... (ups)");
		
	}

	@Override
	public void brake() {
		
		System.out.println("Frenando el avión.");
		
	}

}

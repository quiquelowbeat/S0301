package n3exercici1_vehicles;

public class Bicycle implements Vehicle {

	@Override
	public void startEngine() {
		
		System.out.println("Las bicicletas no arrancan... No tienen motor.");
		
	}

	@Override
	public void speedUp() {
		
		System.out.println("Pedaleando más fuerte.");
		
	}

	@Override
	public void brake() {
		
		System.out.println("Frenando la bici.");
		
	}

}

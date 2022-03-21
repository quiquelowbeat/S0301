package n1exercici1;

import java.util.ArrayList;

public final class Undo {
	
	private static Undo instance;
	private static ArrayList<String> arrayCommands = new ArrayList<String>();
	private static int numberOfCommands;

	
	private Undo() {};
	 
	public static Undo getInstance() {
		
		if(instance == null) {
			instance = new Undo();
		}
		
		return instance;
		
	}
	
	public static void setNumberOfCommands(int numberOfCommands) {
		
		Undo.numberOfCommands = numberOfCommands;
		
	}

	public static void setNewCommand(String command) {
		
		if(Undo.arrayCommands.size() == numberOfCommands) {
			
			Undo.arrayCommands.remove(0);
			
		}
		
		Undo.arrayCommands.add(command);
		
	}
	
	public static void controlZ() {
		
		System.out.println("Borrando último comando utilizado: " + Undo.arrayCommands.get((arrayCommands.size() - 1)) + "\n");
		Undo.arrayCommands.remove((arrayCommands.size() - 1));
		
	}
	
	public static void showLastCommand() {
		
		System.out.println("Último comando utilizado: " + Undo.arrayCommands.get((arrayCommands.size() - 1)) + "\n");
		
	}
	
	public void showAllCommands() {
		
		System.out.println("\nMostrando todos los comandos registrados: \n");
		Undo.arrayCommands.forEach(System.out::println);
		
	}

}


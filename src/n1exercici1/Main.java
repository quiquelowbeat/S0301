package n1exercici1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int intOption = 0;
		
		Undo undo = Undo.getInstance();
		Undo undo2 = Undo.getInstance(); // Intentem fer nous objectes undo per posar a prova el programa.
		Undo undo3 = Undo.getInstance();
		
		System.out.println("'Undo' guarda los últimos comandos introducidos por el usuario.\n"
				+ "¿Cuántos comandos quieres guardar?");
		
		intOption = entrada.nextInt();
		Undo.setNumberOfCommands(intOption);
		System.out.println("\n");
		
		Undo.setNewCommand("copiar");
		Undo.setNewCommand("pegar");
		Undo.setNewCommand("cortar");
		Undo.setNewCommand("imprimir");
		Undo.setNewCommand("copiar");
		Undo.setNewCommand("cortar");
		Undo.setNewCommand("copiar");
		Undo.setNewCommand("pegar");
		Undo.setNewCommand("cortar");
		Undo.setNewCommand("imprimir");
		Undo.setNewCommand("copiar");
		Undo.setNewCommand("cortar");
		Undo.setNewCommand("imprimir pantalla");
		Undo.setNewCommand("debug");
		Undo.setNewCommand("refactor");
		
		Undo.controlZ(); // Esborra l'últim command utilitzat.
		Undo.controlZ();
		Undo.controlZ();
		
		Undo.showLastCommand(); // Mostra l'últim command utilitzat.
		
		undo.showAllCommands();
	    undo2.showAllCommands(); // Imprimeix la mateixa ArrayList de la clase Undo original.
	    undo3.showAllCommands(); // Imprimeix la mateixa ArrayList de la clase Undo original.
	    
	    entrada.close();
	}

}

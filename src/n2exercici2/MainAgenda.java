package n2exercici2;

import n2Factories.AbstractEntryFactory;
import n2Factories.FactoryProducer;
import n2Factories.FranceEntryFactory;
import n2Factories.SpainEntryFactory;
import n2Factories.UsaEntryFactory;
import n2Products.Entry;
import n2Products.FranceAddress;
import n2Products.FrancePhoneNumber;
import n2Products.SpainPhoneNumber;
import n2Products.SpainAddress;
import n2Products.UsaAddress;
import n2Products.UsaPhoneNumber;

public class MainAgenda { 
	
	// Creamos inicialmente un "productora" de factorías simple.
	
	static FactoryProducer factoryProducer = new FactoryProducer();
	
	// A partir de la productora de fábricas creamos la fábrica USA, France y Spain.

	static AbstractEntryFactory usaFactory = factoryProducer.createFactory(FactoryProducer.countrySelector.USA);
	static AbstractEntryFactory franceFactory = factoryProducer.createFactory(FactoryProducer.countrySelector.FRANCE);
	static AbstractEntryFactory spainFactory = factoryProducer.createFactory(FactoryProducer.countrySelector.SPAIN);
	
	public static void main(String[] args) { // PATRÓN ABSTRACT FACTORY
		
		newEntry(usaFactory, "Henry", "Flemming", "", "Dowling Street",  36, "3L", "98765", "San Francisco", "CA", 600564536);
		newEntry(franceFactory, "Emmanuel", "Macron", "", "Rue de la Marsellesa", 45, "3B", "75004", "Paris", "", 613564216);
		newEntry(spainFactory, "Quique", "Sánchez", "Flores", "Via Laietana", 45, "3-2", "08001", "Barcelona", "", 678576523);
		newEntry(usaFactory, "John", "Stewart", "", "Karma Street", 56, "2-3", "98675", "Los Angeles", "CA", 654323142);
		
		Entry.readAllEntries();
		
	}
	
	public static void newEntry(AbstractEntryFactory factory, String name, String lastName, String secondLastName, String street, int building, String floorAndDoor, String zipcode, String city, String state, int phoneNumber) {
		
		// Creamos este método para centralizar la creación de nuevas entradas. 
		// Usamos el casting y los setters para no tener argumentos en el constructor de la interficie Address y dejarla "limpia".
			
		Entry entry = new Entry(factory);
		
		if(factory instanceof UsaEntryFactory) {
			
			((UsaAddress) entry.getEntryAddress()).setAddress(name, lastName, building, street, floorAndDoor, city, state, zipcode); 
			((UsaPhoneNumber) entry.getEntryPhoneNumber()).setPhoneNumber(phoneNumber);
			
		} else if(factory instanceof FranceEntryFactory) {
			
			((FranceAddress) entry.getEntryAddress()).setAddress(name, lastName, building, street, floorAndDoor, city, zipcode);
			((FrancePhoneNumber) entry.getEntryPhoneNumber()).setPhoneNumber(phoneNumber);
			
		} else if(factory instanceof SpainEntryFactory) {
			
			((SpainAddress) entry.getEntryAddress()).setAddress(name, lastName, secondLastName, street, building, floorAndDoor, zipcode, city);
			((SpainPhoneNumber) entry.getEntryPhoneNumber()).setPhoneNumber(phoneNumber);
			
		} 
		
		Entry.newEntryToArray(entry);
		
	}
	
}

package n2exercici2;

import n2Factories.AsbtractEntryFactory;
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
	
	// Creamos inicialmente las factorías que crearán objetos Address y PhoneNumber a partir de la factoría abstracta según el formato de país.	
	
	static AsbtractEntryFactory usaFactory = new UsaEntryFactory();
	static AsbtractEntryFactory franceFactory = new FranceEntryFactory();
	static AsbtractEntryFactory spainFactory = new SpainEntryFactory();
	
	public static void main(String[] args) {
		
		newEntry(usaFactory, "Henry", "Flemming", "", "Dowling Street",  36, "3L", "98765", "San Francisco", "CA", 600564536);
		newEntry(franceFactory, "Emmanuel", "Macron", "", "Rue de la Marsellesa", 45, "3B", "75004", "Paris", "", 613564216);
		newEntry(spainFactory, "Quique", "Sánchez", "Flores", "Via Laietana", 45, "3-2", "08001", "Barcelona", "", 678576523);
		newEntry(usaFactory, "John", "Stewart", "", "Karma Street", 56, "2-3", "98675", "Los Angeles", "CA", 654323142);
		
		Entry.readAllEntries();
		
	}
	
	public static void newEntry(AsbtractEntryFactory factory, String name, String lastName, String secondLastName, String street, int building, String floorAndDoor, String zipcode, String city, String state, int phoneNumber) {
		
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

package n2Products;

import java.util.ArrayList;

import n2Factories.AsbtractEntryFactory;

public class Entry {
	
	private Address entryAddress;
	private PhoneNumber entryPhoneNumber;
	private static ArrayList<Entry> arrayEntries = new ArrayList<Entry>();
	
	public Entry(AsbtractEntryFactory factory) {
		
		entryAddress = factory.createAddress();
		entryPhoneNumber = factory.createPhoneNumber();
		
	}

	public Address getEntryAddress() {
		
		return entryAddress;
		
	}

	public PhoneNumber getEntryPhoneNumber() {
		
		return entryPhoneNumber;
		
	}

	public static ArrayList<Entry> getArrayEntries() {
		
		return arrayEntries;
		
	}

	public static void newEntryToArray(Entry entry) {
		
		Entry.arrayEntries.add(entry);
		
	}
	
	public static void readAllEntries() {
		
		for(Entry entry : Entry.arrayEntries) {
			
			System.out.println("**************************");
			entry.getEntryAddress().getAddress();
			entry.getEntryPhoneNumber().getPhoneNumber();
			System.out.println("**************************\n");
			
		}
		
	}
	
}

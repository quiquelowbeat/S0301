package n2Products;

public class FranceAddress implements Address {

	private String name;
	private String lastName;
	private int building;
	private String floorAndDoor;
	private String street;
	private String city;
	private String zipcode;
	
	public void setAddress(String name, String lastName, int building, String street, String floorAndDoor, String city, String zipcode) {
		
		this.name = name;
		this.lastName = lastName;
		this.building = building;
		this.floorAndDoor = floorAndDoor;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;	
		
	}
	
	@Override
	public void getAddress() {
		
		System.out.println(this.name + " " + this.lastName + "\n" + this.building + " " 
				+ this.street + " " + this.floorAndDoor + "\n" + this.zipcode + " " + this.city +"\nFRANCE");
		
	}

}

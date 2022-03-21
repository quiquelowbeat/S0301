package n2Products;

public class SpainAddress implements Address {

	private String name;
	private String lastName;
	private String secondLastName;
	private int building;
	private String floorAndDoor;
	private String street;
	private String city;
	private String zipcode;
	
	public void setAddress(String name, String lastName, String secondLastName, String street, int building, String floorAndDoor, String zipcode, String city) {
		
		this.name = name;
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.building = building;
		this.floorAndDoor = floorAndDoor;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;	
		
	}

	@Override
	public void getAddress() {
		
		System.out.println(this.name + " " + this.lastName + " " + this.secondLastName + "\n" 
				+ this.street + ", " + this.building + ", " + this.floorAndDoor + "\n" + this.zipcode + " " + this.city + "\nSPAIN");
		
	}

}

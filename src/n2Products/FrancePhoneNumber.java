package n2Products;

public class FrancePhoneNumber implements PhoneNumber {

	private int phoneNumber;
	
	public void setPhoneNumber(int phoneNumber) {
		
		this.phoneNumber = phoneNumber;
		
	}

	@Override
	public void getPhoneNumber() {
		
		System.out.println("+33 - " + this.phoneNumber);
		
	}

}

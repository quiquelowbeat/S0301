package n2Products;

public class UsaPhoneNumber implements PhoneNumber {

	private int phoneNumber;
	
	public void setPhoneNumber(int phoneNumber) {
		
		this.phoneNumber = phoneNumber;
		
	}

	@Override
	public void getPhoneNumber() {
		
		System.out.println("+1 - " + this.phoneNumber);
		
	}

}

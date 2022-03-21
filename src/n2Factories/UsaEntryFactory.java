package n2Factories;

import n2Products.Address;
import n2Products.PhoneNumber;
import n2Products.UsaAddress;
import n2Products.UsaPhoneNumber;

public class UsaEntryFactory extends AsbtractEntryFactory {
		
	@Override
	public Address createAddress() {
		
		return new UsaAddress();
		
	}
	
	@Override
	public PhoneNumber createPhoneNumber() {
		
		return new UsaPhoneNumber();
		
	}

}

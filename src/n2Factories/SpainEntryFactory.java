package n2Factories;

import n2Products.Address;
import n2Products.PhoneNumber;
import n2Products.SpainAddress;
import n2Products.SpainPhoneNumber;

public class SpainEntryFactory extends AsbtractEntryFactory {

	@Override
	public Address createAddress() {
		
		return new SpainAddress();
		
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		
		return new SpainPhoneNumber();
	}

}

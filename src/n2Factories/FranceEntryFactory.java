package n2Factories;

import n2Products.Address;
import n2Products.FranceAddress;
import n2Products.FrancePhoneNumber;
import n2Products.PhoneNumber;

public class FranceEntryFactory extends AbstractEntryFactory {

	@Override
	public Address createAddress() {
		
		return new FranceAddress();
		
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		
		return new FrancePhoneNumber();
	}

}

package n2Factories;

import n2Products.Address;
import n2Products.PhoneNumber;

public abstract class AbstractEntryFactory {
	
	public abstract Address createAddress();
	public abstract PhoneNumber createPhoneNumber();

}

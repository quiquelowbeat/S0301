package n2Factories;

import n2Products.Address;
import n2Products.PhoneNumber;

public abstract class AsbtractEntryFactory {
	
	public abstract Address createAddress();
	public abstract PhoneNumber createPhoneNumber();

}

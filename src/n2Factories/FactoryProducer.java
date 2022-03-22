package n2Factories;

public class FactoryProducer { // SIMPLE FACTORY
	
	public enum countrySelector {USA, FRANCE, SPAIN};
	
	public AsbtractEntryFactory createFactory(countrySelector selec) {
		
		AsbtractEntryFactory factory = null;
		
		switch(selec) {
		
			case USA:
				
				factory = new UsaEntryFactory();
				break;
				
			case FRANCE:
				
				factory = new FranceEntryFactory();
				break;
				
			case SPAIN:
				
				factory = new SpainEntryFactory();
				break;
		
		}
		
		return factory;
	}
	
	

}

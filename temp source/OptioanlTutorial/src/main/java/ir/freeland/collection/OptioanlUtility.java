package ir.freeland.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptioanlUtility {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//create
		 String name = "Alireza";
		Optional<String> empty = Optional.empty();
		Optional<String> opt = Optional.of(name); //can not be null
		Optional<String> optNullable = Optional.ofNullable(name);
		
		//checking presents
		opt.isEmpty();
		opt.isPresent();
		
		//null handle in methods
		printStringName("alireza");
		printStringName(null);
		
		Optional.ofNullable(name).orElseThrow(IllegalArgumentException::new);
		
		//Conditional Return 
    	Integer year = 2016;
	    Optional<Integer> yearOptional = Optional.of(year);
	    boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
	    boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
	    
	  //Conditional Return advance
	    Modem modem = new Modem();
	    priceIsInRange(modem);
	    
	    //using map
	    List<String> companyNames = Arrays.asList(
	    	      "paypal", "oracle", "", "microsoft", "", "apple");
	   Optional<List<String>> listOptional = Optional.of(companyNames);

	   int size = listOptional.map(List::size).orElse(0);
	   
	    
	}
	
	private static void printStringName(String name) {
//		if(name != null) {
//			System.out.println(name.length());
//		}		
		Optional.ofNullable(name).ifPresent( t -> t.length()) ;
		
	}
	
	public static boolean priceIsInRange(Modem modem) {
//	    boolean isInRange = false;
//
//	    if (modem != null && modem.getPrice() != null 
//	      && (modem.getPrice() >= 10 
//	        && modem.getPrice() <= 15)) {
//
//	        isInRange = true;
//	    }
//	    return isInRange;
	    
	    
	    return Optional.ofNullable(modem)
	    	       .map(Modem::getPrice)
	    	       .filter(p -> p >= 10)
	    	       .filter(p -> p <= 15)
	    	       .isPresent();
	}
}

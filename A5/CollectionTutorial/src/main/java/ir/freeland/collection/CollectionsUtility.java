package ir.freeland.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtility {
	public static void main(String[] args) {

		// Creating a list 
        // Declaring object of string type 
        List<String> items = new ArrayList<>(); 
  
        // Adding elements to the list 
        // using add() method 
        items.add("Shoes"); 
        items.add("Toys"); 
  
        // Adding one or more elements using addAll() 
        Collections.addAll(items, "Fruits", "Bat", "Mouse"); 
  
        // Sorting according to default ordering 
        // using sort() method 
        Collections.sort(items); 
  
  
        System.out.println(); 
  
        // Sorting according to reverse ordering 
        Collections.sort(items, Collections.reverseOrder()); 
  
        
        //Search
        System.out.println( "The index of Horse is "  + Collections.binarySearch(items, "Bat")); 

        //copy some elements
        List<String> destinationList = new ArrayList<>();
        destinationList.add("Shoes"); 
        destinationList.add("Toys");
        destinationList.add("Chairs"); 
        
        List<String> sourceList = new ArrayList<>();
        sourceList.add("Bat"); 
        sourceList.add("Frog"); 
        
        Collections.copy(destinationList, sourceList);
        
        
        //disjoint
        List<String> list1 = List.of("Shoes","Toys","Horse","Tiger");
        List<String> list2 = List.of("Bat","Frog","Lion");        
        Collections.disjoint(list1,list2);
        
	}
}

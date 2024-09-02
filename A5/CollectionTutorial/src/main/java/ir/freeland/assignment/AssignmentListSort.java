package ir.freeland.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ir.freeland.assignment.model.AssignmentAddress;
import ir.freeland.assignment.model.AssignmentPerson;
import ir.freeland.collection.model.Product;

public class AssignmentListSort {

	public static void main(String[] args) {

		AssignmentAddress add1 = new AssignmentAddress("Tehran","Iran","Mirdamad");
		AssignmentAddress add2 = new AssignmentAddress("Tehran","Iran","Amirkabir");
		AssignmentAddress add3 = new AssignmentAddress("Tehran","Iran","Pasdaran");
		AssignmentAddress add4 = new AssignmentAddress("Tehran","Iran","Italia");
		AssignmentPerson per1 = new AssignmentPerson("Ali", "Parsa", 40, add1); 
		AssignmentPerson per2 = new AssignmentPerson("Mina", "Shakibaee", 20, add2); 
		AssignmentPerson per3 = new AssignmentPerson("Sina", "Sadeghi", 26, add3); 
		AssignmentPerson per4 = new AssignmentPerson("Maryam", "Jalili", 42, add4); 
		
		List<AssignmentPerson> AtPers = new ArrayList<>();
		AtPers.add(per1);
		AtPers.add(per2);
		AtPers.add(per3);
		AtPers.add(per4);

		System.out.println( AtPers );
		
		Collections.sort( AtPers );		
		System.out.println( AtPers );
		
		Collections.sort(AtPers, new Comparator<AssignmentPerson>() {
			@Override
			public int compare(AssignmentPerson o1, AssignmentPerson o2) {
				return o1.getAddress().getStreet().compareTo(o2.getAddress().getStreet());
			}
			
		});
		
		Collections.sort(AtPers, new AssignmentSortPersonByAddress());
		
		int found = Collections.binarySearch(AtPers, per4);
		System.out.println( AtPers.get(found) );
	}
}

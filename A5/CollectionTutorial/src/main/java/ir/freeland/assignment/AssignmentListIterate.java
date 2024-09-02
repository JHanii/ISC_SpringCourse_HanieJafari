package ir.freeland.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ir.freeland.assignment.model.AssignmentAddress;
import ir.freeland.assignment.model.AssignmentPerson;
import ir.freeland.collection.model.Person;

public class AssignmentListIterate {
	public static void main(String[] args) {

		AssignmentAddress add1 = new AssignmentAddress("Tehran","Iran","Mirdamad");
		AssignmentAddress add2 = new AssignmentAddress("Tehran","Iran","Amirkabir");
		AssignmentAddress add3 = new AssignmentAddress("Tehran","Iran","Pasdaran");
		AssignmentPerson per1 = new AssignmentPerson("Ali", "Parsa", 40, add1); 
		AssignmentPerson per2 = new AssignmentPerson("Mina", "Shakibaee", 20, add2); 
		AssignmentPerson per3 = new AssignmentPerson("Sina", "Sadeghi", 26, add3); 
		
		
		List<AssignmentPerson> assignmentPersons = new ArrayList<AssignmentPerson>(); //Describe genetics
		assignmentPersons.add(per1);
		assignmentPersons.add(per2);
		assignmentPersons.add(per3);
		
		//use iterator
		for (Iterator<AssignmentPerson> iterator = assignmentPersons.iterator(); iterator.hasNext();) {
			AssignmentPerson per = iterator.next();
			per.setName(  per.getName().toUpperCase() );
		}
		
		for (AssignmentPerson per : assignmentPersons) {
			per.setName(  per.getName().toUpperCase() );
		}
		
		//use iterator for remove
		Iterator<AssignmentPerson> iterator = assignmentPersons.iterator();
		while (iterator.hasNext()) {
			AssignmentPerson per = iterator.next();
			if (per.getAge() == 26) {
				iterator.remove();
			}
			
		}
	}
}

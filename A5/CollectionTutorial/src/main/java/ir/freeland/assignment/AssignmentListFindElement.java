package ir.freeland.assignment;

import java.util.ArrayList;
import java.util.List;

import ir.freeland.assignment.model.AssignmentAddress;
import ir.freeland.assignment.model.AssignmentPerson;
import ir.freeland.collection.model.Customer;

public class AssignmentListFindElement {
	public static void main(String[] args) {

		AssignmentAddress add1 = new AssignmentAddress("Tehran","Iran","Mirdamad");
		AssignmentAddress add2 = new AssignmentAddress("Tehran","Iran","Amirkabir");
		AssignmentAddress add3 = new AssignmentAddress("Rasht","Iran","Parastar");
		//See generic usage
		List<AssignmentAddress> adds = new ArrayList<>();
		adds.add(add1);
		adds.add(add2);
		adds.add(add3);

		// first approach use for
		for (AssignmentAddress add : adds) {
			if (add.getCity().equals("Rasht")) {
				System.out.println("find it!");
			}
		}

		//indexOf and contains use objects.equal
		AssignmentAddress add4 = new AssignmentAddress("Tehran","Iran","Italia");
		adds.contains(add4); // see equals
		
		AssignmentAddress add5 = new AssignmentAddress("Milan","Italy","Via Montenapo");
		System.out.println ( adds.indexOf(add5) ) ; // see equals

	}
}

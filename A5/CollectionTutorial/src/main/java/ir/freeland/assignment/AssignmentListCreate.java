package ir.freeland.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ir.freeland.assignment.model.AssignmentAddress;
import ir.freeland.assignment.model.AssignmentPerson;
import ir.freeland.collection.model.Person;

public class AssignmentListCreate {
	public static void main(String[] args) {
		
		AssignmentAddress add1 = new AssignmentAddress("Tehran","Iran","Mirdamad");
		AssignmentAddress add2 = new AssignmentAddress("Tehran","Iran","Amirkabir");
		AssignmentAddress add3 = new AssignmentAddress("Tehran","Iran","Pasdaran");
		AssignmentAddress add4 = new AssignmentAddress("Tehran","Iran","Italia");
		AssignmentPerson per1 = new AssignmentPerson("Ali", "Parsa", 40, add1); 
		AssignmentPerson per2 = new AssignmentPerson("Mina", "Shakibaee", 20, add2); 
		AssignmentPerson per3 = new AssignmentPerson("Sina", "Sadeghi", 26, add3); 
		AssignmentPerson per4 = new AssignmentPerson("Maryam", "Jalili", 42, add4); 
		
		
		//Solution 1
		List assignmentPersons = new ArrayList();		
		assignmentPersons.add(per1);
		assignmentPersons.add(per2);
		assignmentPersons.add(per3);
		assignmentPersons.add(per4);
		
		//Solution 2
		AssignmentPerson[] assignmentPresonsArray = {per1,per2,per3,per4};
		List assignmentPersons2= Arrays.asList(assignmentPresonsArray);
		
		assignmentPersons.size();
			
		List childs = assignmentPersons.subList(1, 3);
		System.out.println(childs);
		
		assignmentPersons.add(2,per4); //use set to replace
		System.out.println(assignmentPersons);
		
		assignmentPersons.remove(0);
		
		assignmentPersons.clear();
		
	}
}

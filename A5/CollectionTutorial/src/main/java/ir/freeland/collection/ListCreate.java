package ir.freeland.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ir.freeland.collection.model.Person;

public class ListCreate {
	public static void main(String[] args) {

		Person alireza = new Person("Alireza", "afattahi54@gmail.com", 48); 
		Person roham = new Person("Roham", "roham@gmail.com", 10);
		Person arefeh = new Person("Arefeh", "arefeh@gmail.com", 15);
		Person radmeher = new Person("Radmehr", "radmehrer@gmail.com", 12);
		
		
		//Solution 1
		List persons = new ArrayList();		
		persons.add(alireza);
		persons.add(roham);
		persons.add(arefeh);
		
		//Solution 2
		Person[] presonsArray = {alireza,roham,arefeh,radmeher};
		List personss= Arrays.asList(presonsArray);
		
		persons.size();
			
		List childs = persons.subList(1, 3);
		System.out.println(childs);
		
		persons.add(2,radmeher); //use set to replace
		System.out.println(persons);
		
		persons.remove(0);
		
		persons.clear();
		
	}
}

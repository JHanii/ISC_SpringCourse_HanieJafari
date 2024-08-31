package ir.freeland.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ir.freeland.collection.model.Person;

public class ListIterate {
	public static void main(String[] args) {

		Person alireza = new Person("Alireza", "afattahi54@gmail.com", 48); 
		Person roham = new Person("Roham", "roham@gmail.com", 10);
		Person arefeh = new Person("Arefeh", "arefeh@gmail.com", 15);
		
		
		List<Person> persons = new ArrayList<Person>(); //Describe genetics
		persons.add(alireza);
		persons.add(roham);
		persons.add(arefeh);
		
		//use iterator
		for (Iterator<Person> iterator = persons.iterator(); iterator.hasNext();) {
			Person person = iterator.next();
			person.setName(  person.getName().toUpperCase() );
		}
		
		for (Person person : persons) {
			person.setName(  person.getName().toUpperCase() );
		}
		
		//use iterator for remove
		Iterator<Person> iterator = persons.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			if (person.getAge() == 48) {
				iterator.remove();
			}
			
		}
	}
}

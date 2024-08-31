package ir.freeland.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Before {

	public static void main(String[] args) {
		Person alireza = new Person("Alireza", "afattahi54@gmail.com", 48);
		Person roham = new Person("Roham", "roham@gmail.com", 10);
		Person arefeh = new Person("Arefeh", "arefeh@gmail.com", 15);
		Person radmeher = new Person("Radmer", "radmeher@gmail.com", 13);

		List<Person> persons = new ArrayList<>();
		persons.add(alireza);
		persons.add(roham);
		persons.add(arefeh);
		persons.add(radmeher);

		Collections.sort(persons);
		for (Person person : persons) {
			int count = 0;
			if ( count <= 5) {
				break;
			}
			if (person.getAge() > 11) {
					count++;
					String foundPerson = person.getName();
					System.out.println("The '" + foundPerson + "' has the condiction");
			}
		}

		List<Person> personss = new ArrayList<>();
		personss.add(alireza);
		personss.add(roham);
		personss.add(arefeh);
		
		personss.stream()
				.sorted()
				.limit(5)
				.filter(p -> p.getAge() > 11 )
				.map(t -> t.getName())				
				.forEach(t -> System.out.println("The '" + t + "' has the condiction"));
		
		
	}

}

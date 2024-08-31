package ir.freeland.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Intermediate Operations:
 * 
 * filter() map() flatMap() distinct() sorted() peek() limit() skip()
 * 
 * Terminal Operations:
 * 
 * forEach() forEachOrdered() toArray() reduce() collect() min() max() count()
 * anyMatch() allMatch() noneMatch() findFirst() findAny()
 * 
 */
public class DoWithLambda {

	public static void main(String[] args) {

		// ********Simple print
		List<String> list = Arrays.asList("Alireza", "Roham", "Arefeh");
		list.forEach(s -> System.out.println(s));

		// ********Simple Print
		Map<String, Integer> ages = new HashMap<>();
		ages.put("Alireza", 48);
		ages.put("Roham", 10);
		ages.put("RohamSS", 0);
		ages.put("Arefeh", 15);
		ages.forEach((t, u) -> System.out
				.println("The " + t + " is " + u + " years old "));

		// ********make a filter
		List<String> names = Arrays.asList("Alireza", "Roham", "Arefeh",
				"Radmehr", "Rayan");
		List<String> namesStartWithA = names.stream()
				.filter(t -> t.startsWith("A")).collect(Collectors.toList());
		System.out.println(namesStartWithA);

		names.replaceAll(t -> t.toLowerCase());

		// ********convert items in list
		List<String> names2 = Arrays.asList("Alireza", "Roham", "Arefeh", "Radmehr", "Rayan");
		names2.replaceAll(t -> t.toLowerCase());// no stream is needed. no new
												// list is returned
		System.out.println(names);

		// ********sum
		List<Integer> values = Arrays.asList(3, 5, 8, 9, 12);
		int sum = values.stream().reduce(0, (i1, i2) -> i1 + i2);
		System.out.println(sum);

		// **** chain filter
		Person alireza = new Person("Alireza", "afattahi54@gmail.com", 48);
		Person roham = new Person("Roham", "roham@gmail.com", 10);
		Person arefeh = new Person("Arefeh", "arefeh@gmail.com", 15);

		List<Person> persons = new ArrayList<>();
		persons.add(alireza);
		persons.add(roham);
		persons.add(arefeh);

		persons.stream()
				.filter(t -> t.getName().startsWith("A"))
				.filter(t -> t.getAge() > 16)
				.forEach(t -> System.out.println(t.getName()));

		// **** sort and reverse
		persons.sort((p1, p2) -> p1.getAge() - p2.getAge());
		System.out.println(persons);

		Comparator<Person> compareAge = (p1, p2) -> p1.getAge() - p2.getAge();
		compareAge.reversed();
		persons.sort(compareAge.reversed());

		System.out.println(persons);

		Comparator<Person> compratorComplex = Comparator
				.comparing(Person::getAge).thenComparing(Person::getName);
		persons.sort(compratorComplex);

		// ****find average of age
		double averageAge = persons
					.stream()
					.mapToDouble(p -> p.getAge())
					.average()
					.getAsDouble();
		
		System.out.println(averageAge);

	}

}

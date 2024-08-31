package ir.freeland.lambda;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class AdvancedCollectors {

	public static void main(String[] args) {

		Person alireza = new Person("Alireza", "afattahi54@gmail.com", 48);
		Person roham = new Person("Roham", "roham@gmail.com", 10);
		Person arefeh = new Person("Arefeh", "arefeh@gmail.com", 15);
		Person radmehr = new Person("Radmehr", "radmehr@gmail.com", 15);

		Person[] personsArray = {alireza, roham, arefeh , radmehr};
		
		List<Person> persons = Arrays.asList(personsArray);
		
		String allNames = persons.stream().map(Person::getName).collect( Collectors.joining(","));
		System.out.println(allNames);
		
		DoubleSummaryStatistics stats= 
				persons.stream()
					.filter(p -> p.getAge()>15)
					.collect(	
							Collectors.summarizingDouble(p -> p.getAge()));
		
		System.out.println( stats );
		
		//Use group by
		Map<Integer, List<Person>> groupAge = 
				persons.stream().collect(  Collectors.groupingBy(Person::getAge));
		System.out.println(groupAge);
		
		//PartitioningBy is a specialized case of groupingBy that accepts a Predicate 
		Map<Boolean, List<Person>> adultsAge = 
				persons.stream().collect( Collectors.partitioningBy(p -> p.getAge()>18));
		
		System.out.println(adultsAge);
	}

}

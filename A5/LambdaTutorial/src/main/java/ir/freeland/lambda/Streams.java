package ir.freeland.lambda;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * A stream does not store data and, in that sense, is not a data structure. It
 * also never modifies the underlying data source.
 * 
 * This functionality – java.util.stream – supports functional-style operations
 * on streams of elements, such as map-reduce transformations on collections.
 */
public class Streams {

	public static void main(String[] args) {

		Person alireza = new Person("Alireza", "afattahi54@gmail.com", 48);
		Person roham = new Person("Roham", "roham@gmail.com", 10);
		Person arefeh = new Person("Arefeh", "arefeh@gmail.com", 15);

		Person[] persons = {alireza, roham, arefeh};
		// convert array to stream
		Stream.of(persons);

		Stream.of(persons[0], persons[2]);

		IntStream.of(1, 2, 3);
		IntStream.range(10, 20).forEach(System.out::println);

		// Generator
		List<Integer> randomNumbers = Stream.generate
				(() -> new Random().nextInt(10))
				.limit(5)
				.toList();
		System.out.println(randomNumbers);
		
		Stream<Integer> evenNumberGenerator= Stream.iterate( 2, i-> i*2);
		System.out.println(evenNumberGenerator.limit(10).toList());
		
		}

}

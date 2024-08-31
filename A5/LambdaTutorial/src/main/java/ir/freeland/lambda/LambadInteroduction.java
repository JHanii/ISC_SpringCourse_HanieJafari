package ir.freeland.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;

public class LambadInteroduction {
	public static void main(String[] args) {
				
		Function<String, String> uppercaseFunction = new Function<String, String>() {

			@Override
			public String apply(String t) {				
				return t.toUpperCase();
			}};
		
		String upperCase = uppercaseFunction.apply("Alireza");
		System.out.println(upperCase);
		
		Function<String, String> upperCasefunction1 = (s) -> {return s.toUpperCase();};
		Function<String, String> upperCasefunction2 =  s  ->  s.toUpperCase();
		Function<String, String> upperCasefunction3 =  String::toUpperCase;

		String upperCase1 = upperCasefunction1.apply("Alireza");
		String upperCase2 = upperCasefunction2.apply("Alireza");
		String upperCase3 = upperCasefunction3.apply("Alireza");
		
		Consumer<String> addHello = s -> System.out.println("Hello " + s);
		addHello.accept("Alireza");
		
		BiFunction<String,String,String> conctaStrings = (s1,s2) -> s1+s2;
		String contact = conctaStrings.apply("Ali", "reza");
		System.out.println(contact);
		
		Predicate<String> hasAtSign = s -> s.contains("@");
		System.out.println(hasAtSign.test("afattahi@yahoo.com"));
		
		int[] fibs = {0, 1};
		Supplier<Integer> fib = () -> {
							int result = fibs[1];
						    int fib3 = fibs[0] + fibs[1];
						    fibs[0] = fibs[1];
						    fibs[1] = fib3;
						    return result;
						};
		System.out.println(fib.get());
		
	}
}

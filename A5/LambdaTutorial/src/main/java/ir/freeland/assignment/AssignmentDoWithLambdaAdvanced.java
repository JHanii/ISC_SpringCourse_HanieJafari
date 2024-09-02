package ir.freeland.assignment;

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
public class AssignmentDoWithLambdaAdvanced {

	public static void main(String[] args) {
		//+10 Student objects
		AssignmentStudent s1 = new AssignmentStudent("Ali", "Sadri", 17, 17);
		AssignmentStudent s2 = new AssignmentStudent("Mina", "Shakibaee", 20, 16);
		AssignmentStudent s3 = new AssignmentStudent("Sina", "Mohammadi", 30, 12);
		AssignmentStudent s4 = new AssignmentStudent("Zohre", "Minaee", 27, 8);
		AssignmentStudent s5 = new AssignmentStudent("Samira", "Azari", 24, 19);
		AssignmentStudent s6 = new AssignmentStudent("Parsa", "Mousavi", 26, 18);
		AssignmentStudent s7 = new AssignmentStudent("Niusha", "Shirvani", 25, 14);
		AssignmentStudent s8 = new AssignmentStudent("Soheil", "Jafari", 38, 16.5);
		AssignmentStudent s9 = new AssignmentStudent("Taha", "Taghavi", 32, 17.5);
		AssignmentStudent s10 = new AssignmentStudent("Sahar", "Sanaye", 44, 11.5);
		
		
		// toList
		List<AssignmentStudent> students = Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10)
				.stream()
				.collect(Collectors.toList());

		System.out.println(students);
		
		//sort _reverse
				Comparator<AssignmentStudent> compareAge = (p1, p2) -> p1.getAge() - p2.getAge();
				compareAge.reversed();
				List<AssignmentStudent> reversedSortedStudents = students
						.stream()
						.sorted(compareAge.reversed())
						.collect(Collectors.toList());

				System.out.println(reversedSortedStudents);

		//Partitioning By grades(<10,>=10)
		Map<Boolean, List<AssignmentStudent>> passedGrades = 
		students.stream()
		.collect(Collectors.partitioningBy(p -> p.getGrade()>=10));
		passedGrades.forEach((t,u) -> System.out.println(t.toString()+ " : " + u));
				

		//groupingBy age
		Map<Integer, List<AssignmentStudent>> groupbyAge = 
		students.stream().collect(  Collectors.groupingBy(AssignmentStudent::getAge));
		groupbyAge.forEach( (t,u) -> System.out.println(t.toString()+ " : " + u) );
		

		// grades average
		double averageGrade = students
					.stream()
					.mapToDouble(s -> s.getGrade())
					.average()
					.getAsDouble();				
		System.out.println(averageGrade);
		
		// grades average for +18 years-olds
		double averageGrade18 = students
				.stream()
				.filter(p -> p.getAge()>18)
				.mapToDouble(s -> s.getGrade())
				.average()
				.getAsDouble();				
	System.out.println(averageGrade18);
	
	}
}

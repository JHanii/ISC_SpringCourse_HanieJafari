package ir.freeland.collection;

import java.util.ArrayList;
import java.util.List;

import ir.freeland.collection.model.Customer;

public class ListFindElement {
	public static void main(String[] args) {

		Customer alireza = new Customer(1, "Alireza", "afattahi54@gmail.com", 48);
		Customer roham = new Customer(2, "Roham", "roham@gmail.com", 10);
		Customer arefeh = new Customer(3, "Arefeh", "arefeh@gmail.com", 15);
		//See generic usage
		List<Customer> customers = new ArrayList<>();
		customers.add(alireza);
		customers.add(roham);
		customers.add(arefeh);

		// first approach use for
		for (Customer customer : customers) {
			if (customer.getName().equals("Alireza")) {
				System.out.println("find it!");
			}
		}

		//indexOf and contains use objects.equal
		Customer radmeher = new Customer(4, "Radmehr", "radmehrer@gmail.com", 12);
		customers.contains(radmeher); // see equals
		
		Customer shadowArefeh = new Customer(3, "Aref", "atest@gmail.com" , 30);
		System.out.println ( customers.indexOf(shadowArefeh) ) ; // see equals

	}
}

package ir.freeland.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ir.freeland.collection.model.Product;

public class ListSort {

	public static void main(String[] args) {

		Product laptop = new Product(1, "laptop", 10000);
		Product mobile = new Product(2, "mobile", 500);
		Product handsfree = new Product(3, "handsfree", 100);
		Product flash = new Product(4, "flash", 10);
		
		List<Product> products = new ArrayList<>();
		products.add(laptop);
		products.add(mobile);
		products.add(handsfree);
		products.add(flash);

		System.out.println( products );
		
		Collections.sort( products );		
		System.out.println( products );
		
		Collections.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getPrice() - o2.getPrice();
			}
			
		});
		
		Collections.sort(products, new SortProductByPrice());
		
		int found = Collections.binarySearch(products, flash);
		System.out.println( products.get(found) );
	}
}

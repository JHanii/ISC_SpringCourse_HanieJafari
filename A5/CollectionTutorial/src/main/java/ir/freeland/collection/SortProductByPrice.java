package ir.freeland.collection;

import java.util.Comparator;

import ir.freeland.collection.model.Product;

public class SortProductByPrice implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		return o1.getPrice() - o2.getPrice();
	}
}

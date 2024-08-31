package ir.freeland.springboot.requestparam.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Shop {
	@JsonProperty("shopname")
    private String name;
    private List<Product> products;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Shop [name=" + name + ", products=" + products + "]";
	}
	


}
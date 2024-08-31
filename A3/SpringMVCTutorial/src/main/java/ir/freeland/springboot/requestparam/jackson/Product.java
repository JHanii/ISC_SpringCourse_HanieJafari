package ir.freeland.springboot.requestparam.jackson;

public class Product {
	
    private String name;
    private String price;
    private boolean available;

    public Product() {
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", available="
				+ available + "]";
	}


}
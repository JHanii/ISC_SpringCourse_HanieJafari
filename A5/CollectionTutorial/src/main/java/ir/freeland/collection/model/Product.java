package ir.freeland.collection.model;

public class Product implements Comparable<Object> {
    
	private int id;
    private String name;
    private int price;
    
    
    public Product(int id, String name, int price) {
    	this.id=id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return price;
    }
    
    public void setName(String name) {
    	this.name = name;
		
	}

    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public void setAge(int age) {
		this.price = age;
	}

	
		
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
    public String toString() {
        return "Person{ id= " + id + " ,name=" + name +  ", price=" + price + "}";
    }

	@Override
	public int compareTo(Object o) {
		Product other = (Product)o;
		return this.price - other.price;
		
	}
}

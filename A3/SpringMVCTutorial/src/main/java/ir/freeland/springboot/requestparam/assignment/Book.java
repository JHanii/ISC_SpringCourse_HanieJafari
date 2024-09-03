package ir.freeland.springboot.requestparam.assignment;

public class Book {
	private String id;
    private String name;
    private String price;
    private boolean available;

    public Book() {
    }
    
    public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
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
		return "Product [id=" + id + "name=" + name + ", price=" + price + ", available="
				+ available + "]";
	}

	public Book save(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	public Book findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Book book) {
		// TODO Auto-generated method stub
		if(book != null)
		{
			this.id = id;
			this.name = book.name;
			this.price = book.price;
			this.available = book.available;
		}
	}


}
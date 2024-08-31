package ir.freeland.collection.model;

import java.util.Objects;

public class Customer {
    
	private int id;
    private String name;
    private String email;
    private int age;
    
    
    public Customer(int id, String name, String email, int age) {
    	this.id=id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
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

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

		
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return id == other.id;
	}

	@Override
    public String toString() {
        return "Person{ id= " + id + " ,name=" + name + ", email=" + email + ", age=" + age + "}";
    }
}

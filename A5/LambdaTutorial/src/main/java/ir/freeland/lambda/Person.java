package ir.freeland.lambda;

public class Person implements Comparable<Person>{
    	
    private String name;
    private String email;
    private int age;
    
    public Person(String name, String email, int age) {
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


	public void setEmail(String email) {
		this.email = email;
	}


	public void setAge(int age) {
		this.age = age;
	}

	@Override
    public String toString() {
        return "Person{ name=" + name + ", email=" + email + ", age=" + age + "}";
    }

	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
}

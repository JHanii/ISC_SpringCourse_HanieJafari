package ir.freeland.assignment.model;

public class AssignmentPerson implements Comparable<AssignmentPerson>{
    	
    private String name;
    private String fullName;
    private int age;
    private AssignmentAddress address;
    
    public AssignmentPerson(String name, String fullName, int age, AssignmentAddress address) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
    
    public AssignmentAddress getAddress() {
    	return address;
    }
    
    public void setName(String name) {
    	this.name = name;
		
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public void SetAddress(AssignmentAddress address) {
		this.address = address;
	}

	@Override
    public String toString() {
        return "Person{ name=" + name + ", fullName=" + fullName + ", age=" + age + ", address=" + address + "}";
    }

	@Override
	public int compareTo(AssignmentPerson o) {
		AssignmentPerson other = (AssignmentPerson)o;
		return this.address.getStreet().compareTo(other.address.getStreet());
	}
}

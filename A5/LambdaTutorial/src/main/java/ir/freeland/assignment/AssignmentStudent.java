package ir.freeland.assignment;

public class AssignmentStudent implements Comparable<AssignmentStudent>{
    	
    private String name;
    private String fname;
    private int age;
    private double grade;
    
    public AssignmentStudent(String name, String fname, int age, double grade) {
        this.name = name;
        this.fname = fname;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getFname() {
        return fname;
    }

    public int getAge() {
        return age;
    }
    
    public double getGrade() {
        return grade;
    }
    
    public void setName(String name) {
    	this.name = name;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
    public String toString() {
        return "Person{ name=" + name + ", fname=" + fname + ", age=" + age + ", grade=" + grade + "}";
    }

	@Override
	public int compareTo(AssignmentStudent o) {
		return this.age - o.age;
	}
}

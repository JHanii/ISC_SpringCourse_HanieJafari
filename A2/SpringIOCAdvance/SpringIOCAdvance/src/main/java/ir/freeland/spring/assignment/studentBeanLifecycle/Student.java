package ir.freeland.spring.assignment.studentBeanLifecycle;

class Student{
	public int studentID;
	public int grade;
	
	public Student(int studentID){
		this.studentID = studentID;
		this.grade = 20;
	}
		
	public void getGrade() {
		System.out.println(this.studentID + " grade is " + this.grade);
	}
}

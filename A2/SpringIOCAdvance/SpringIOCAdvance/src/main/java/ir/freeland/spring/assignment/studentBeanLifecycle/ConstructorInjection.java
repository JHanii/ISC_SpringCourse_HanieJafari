package ir.freeland.spring.assignment.studentBeanLifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {
  public Student student;
  @Autowired
  public ConstructorInjection(Student student) {
	  this.student = student;
  }

  public void getGrade() {
	  student.getGrade();
  }
}

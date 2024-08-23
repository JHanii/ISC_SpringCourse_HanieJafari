package ir.freeland.spring.assignment.studentBeanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  Application {
  @SuppressWarnings("resource")
public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_studentAnnotation.xml");

    ConstructorInjection constructorInjection = context.getBean(ConstructorInjection.class);
    constructorInjection.getGrade();
  }
}

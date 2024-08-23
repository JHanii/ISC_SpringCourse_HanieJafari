package ir.freeland.spring.realworldexample.dao;
//Assignment

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  AssignmentApplicationRealDao {
public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_assignmentRealDao.xml");
    
	AssignmentRealworldDaoFiledInjection assignmentRealworldDaoFiledInjection = context.getBean(AssignmentRealworldDaoFiledInjection.class);
	assignmentRealworldDaoFiledInjection.test();
  }
}
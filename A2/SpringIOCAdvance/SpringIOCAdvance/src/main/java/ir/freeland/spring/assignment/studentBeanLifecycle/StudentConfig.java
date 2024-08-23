package ir.freeland.spring.assignment.studentBeanLifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class StudentConfig {

    // The @Bean annotation is applied at the method level, 
    //and by default, Spring uses the method name as a bean name.
    //This default bean name can be overwritten 
    //we can specify the value using the @Bean annotation:
    @Bean("student")
    Student buildStudent() {
        return new Student(98520000);
    }
    
    @jakarta.annotation.PostConstruct
    public void init() throws Exception
    {
        System.out.println(
            "Bean student has been "
            + "instantiated and I'm the "
            + "init() method");
    }

}

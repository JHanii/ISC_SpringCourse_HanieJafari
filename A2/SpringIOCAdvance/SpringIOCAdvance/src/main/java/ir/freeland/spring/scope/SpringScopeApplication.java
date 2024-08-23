package ir.freeland.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class SpringScopeApplication {

	public static void main(String[] args) {

        @SuppressWarnings("resource")
		ApplicationContext appCtx = new AnnotationConfigApplicationContext( Config.class);

        //property beans
        Person alireza = (Person) appCtx.getBean("personPrototype");
        Person roham = (Person) appCtx.getBean("personPrototype");
        System.out.println( "The prototype beans have different id !!" );
        System.out.println( System.identityHashCode(alireza) );
        System.out.println( System.identityHashCode(roham) );
        
        alireza.setName("Alireza");
        roham.setName("Roham");
        System.out.println( "Alireza: " + alireza);
        System.out.println( "Roham: " + roham);
        
        //singleton beans
        Person radmehr = (Person) appCtx.getBean("personSingleton");
        Person rayan = (Person) appCtx.getBean("personSingleton");
        System.out.println( "The Singleton beans have same id !!" );
        System.out.println( System.identityHashCode(rayan) );
        System.out.println( System.identityHashCode(radmehr) );
        
        radmehr.setName("Radmher");
        System.out.println("Radmher: " + radmehr);
        System.out.println("Rayadn: " + rayan);

        
	}

}

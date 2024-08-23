package ir.freeland.spring.realworldexamplesautowire;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


import ir.freeland.spring.realworldexamplesautowire.services.ServiceImpl1;
import ir.freeland.spring.realworldexamplesautowire.services.ServiceImpl2;
import ir.freeland.spring.realworldexamplesautowire.services.ServiceInterface;
import ir.freeland.spring.realworldexamplesautowire.services.dao.DAOImpl1;
import ir.freeland.spring.realworldexamplesautowire.services.dao.DAOImpl2;
import ir.freeland.spring.realworldexamplesautowire.services.dao.DAOInterface;


@Configuration
@Service
public class ExampleService {

	//Autowires Set of all beans of ServiceInterface
	@Autowired
	private Set<ServiceInterface> serviceSet;

	//Autowires List of all beans of ServiceInterface
	@Autowired
	private List<ServiceInterface> serviceList;

	//Autowires Array of all beans of ServiceInterface
	@Autowired
	private ServiceInterface[] serviceArray;

	// Autowires Map of all beans of ServiceInterface
	@Autowired
	private Map<String, ServiceInterface> serviceMap;

	// Autowired with ServiceImpl1 instance through constructor
	private ServiceImpl1 serviceImpl1;

	// Autowired with ServiceImpl2 instance
	@Autowired
	private ServiceImpl2 serviceImpl2;

	// Autowires primary ServiceInterface in case multiple implementations are
	// available. If no primary are defined, NoUniqueBeanDefinitionException is
	// thrown
	@Autowired
	private ServiceInterface primaryServiceImpl;

//	@Autowired
//	private DAOInterface primaryDAOImpl;
	
	private ServiceInterface constructorQualifierServiceImpl;
	

	// Autowires primary ServiceInterface in case multiple implementations are
	// available. If no primary are defined, NoUniqueBeanDefinitionException is
	// thrown
	@Qualifier("serviceImpl1")
	@Autowired
	private ServiceInterface qualifierServiceImpl;

	// @Autowired is optional in case of single constructor. In case of multiple
	// constructors, one of them must be annotated.
	public ExampleService(ServiceImpl1 serviceImpl1, @Qualifier("serviceImpl2") ServiceInterface constructorQualifierServiceImpl) {
		this.serviceImpl1 = serviceImpl1;
		this.constructorQualifierServiceImpl = constructorQualifierServiceImpl;
	}

	public void printServiceNames() {
		System.out.println("================ Autowiring Through Constructor =======================");
		System.out
				.println("'serviceImpl1' is strongly typed autowired through constructor : " + serviceImpl1.getClass());
		System.out.println();
		System.out.println("================ Autowiring Through Actual class type =================");
		System.out.println("'serviceImpl2' is strongly typed autowired through field : " + serviceImpl2.getClass());
		System.out.println();
		System.out.println("================ Autowiring Through @Primary + @Service ===============");
		System.out.println("'primaryServiceImpl' is autowired with'" + primaryServiceImpl.getClass()
				+ "' since that class is annotated with @Primary out of all possible candidates.");
		System.out.println();
		//System.out.println("================ Autowiring Through @Primary + @Bean ==================");
		//System.out.println("'primaryDAOImpl' is autowired with'" + primaryDAOImpl.getClass()
		//		+ "' since @Bean for that class is annotated with @Primary out of all possible candidates.");
		System.out.println();
		System.out.println("================ Autowiring Through @Autowired + @Qualifier ===========");
		System.out.println("'qualifierServiceImpl' is autowired with'" + qualifierServiceImpl.getClass()
				+ "' since it is annotated with @Qualifier(\"serviceImpl1\").");
		System.out.println();
		System.out.println("================ Autowiring Through Constructor + @Qualifier ===========");
		System.out.println("'constructorQualifierServiceImpl' is autowired with'" + constructorQualifierServiceImpl.getClass()
				+ "' since it is annotated with @Qualifier(\"serviceImpl2\") in constructor.");
		System.out.println();
		System.out.println("================ Autowiring all beans of that type in collection ======");
		System.out.println("The services available in Set are: ");
		serviceSet.forEach(s -> System.out.println(s.getClass()));
		System.out.println();
		System.out.println("The services available in List are: ");
		serviceList.forEach(s -> System.out.println(s.getClass()));
		System.out.println();
		System.out.println("The services available in Array are: ");
		for (ServiceInterface s : serviceArray) {
			System.out.println(s.getClass());
		}
		System.out.println();
		System.out.println("The services available in Map are: ");
		serviceMap.forEach((k, v) -> System.out.println(" Key - '" + k + "' and Value - '" + v.getClass() + "'"));

	}

    // This is an example of @Primay with Bean
    @Primary
    @Bean
    DAOInterface daoImpl1() {
		return new DAOImpl1();
	}

    @Bean
    DAOInterface daoImpl2() {
		return new DAOImpl2();
	}
}

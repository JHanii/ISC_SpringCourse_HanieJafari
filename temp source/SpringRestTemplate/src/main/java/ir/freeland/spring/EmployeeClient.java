package ir.freeland.spring;


import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import ir.freeland.spring.dto.Employee;
import ir.freeland.spring.dto.EmployeeList;


/**
 * Application that shows how to use Lists with RestTemplate.
 */
public class EmployeeClient {
	
	private static RestTemplate restTemplate;
	
    public static void main(String[] args) {
    
    	restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
    	List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
    	interceptors.add(new LoggingRequestInterceptor());
    	restTemplate.setInterceptors(interceptors);
    	
        EmployeeClient employeeClient = new EmployeeClient();

        System.out.println("Calling GET for entity using arrays");
        employeeClient.getForEntityEmployeesAsArray();

        System.out.println("Calling GET using ParameterizedTypeReference");
        employeeClient.getAllEmployeesUsingParameterizedTypeReference();

        System.out.println("Calling GET using wrapper class");
        employeeClient.getAllEmployeesUsingWrapperClass();

        System.out.println("Calling POST using normal lists");
        employeeClient.createEmployeesUsingLists();

        System.out.println("Calling POST using wrapper class");
        employeeClient.createEmployeesUsingWrapperClass();
    }

    public EmployeeClient() {

    }

    public Employee[] getForEntityEmployeesAsArray() {
        ResponseEntity<Employee[]> response =
                restTemplate.getForEntity(
                        "http://127.0.0.1:8080/employees/",
                        Employee[].class);

        Employee[] employees = response.getBody();

        assert employees != null;
        asList(employees).forEach(System.out::println);

        return employees;

    }


    public List<Employee> getAllEmployeesUsingParameterizedTypeReference() {
        ResponseEntity<List<Employee>> response =
                restTemplate.exchange(
                        "http://localhost:8080/employees/",
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Employee>>() {
                        });

        List<Employee> employees = response.getBody();

        assert employees != null;
        employees.forEach(System.out::println);

        return employees;
    }

    public List<Employee> getAllEmployeesUsingWrapperClass() {
        EmployeeList response =
                restTemplate.getForObject(
                        "http://127.0.0.1:8080/employees/v2",
                        EmployeeList.class);

        List<Employee> employees = response.getEmployees();

        employees.forEach(System.out::println);

        return employees;
    }

    public void createEmployeesUsingLists() {
        List<Employee> newEmployees = new ArrayList<>();
        newEmployees.add(new Employee(3, "Intern"));
        newEmployees.add(new Employee(4, "CEO"));

        restTemplate.postForObject(
                "http://localhost:8080/employees/",
                newEmployees,
                ResponseEntity.class);
    }

    public void createEmployeesUsingWrapperClass() {
        List<Employee> newEmployees = new ArrayList<>();
        newEmployees.add(new Employee(3, "Intern"));
        newEmployees.add(new Employee(4, "CEO"));

        restTemplate.postForObject(
                "http://localhost:8080/employees/v2",
                new EmployeeList(newEmployees),
                ResponseEntity.class);
    }
}

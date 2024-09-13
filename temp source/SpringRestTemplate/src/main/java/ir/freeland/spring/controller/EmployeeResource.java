package ir.freeland.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ir.freeland.spring.dto.Employee;
import ir.freeland.spring.dto.EmployeeList;
import ir.freeland.spring.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeResource
{
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public List<Employee> getEmployees()
    {
        return employeeService.getAllEmployees();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/v2")
    public EmployeeList getEmployeesUsingWrapperClass()
    {
        List<Employee> employees = employeeService.getAllEmployees();
        return new EmployeeList(employees);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/")
    public void addEmployees(@RequestBody List<Employee> employees)
    {
        employeeService.addEmployees(employees);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/v2")
    public void addEmployeesUsingWrapperClass(@RequestBody EmployeeList employeeWrapper)
    {
        employeeService.addEmployees(employeeWrapper.getEmployees());
    }
}

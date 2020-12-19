package com.ratnaglobal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ratnaglobal.model.Company;
import com.ratnaglobal.model.Employee;
import com.ratnaglobal.service.EmployeeServiceImp;

//mark class as Controller  
@RestController
public class EmployeeController {
	
	// autowire the EmployeeService class
	@Autowired
	EmployeeServiceImp employeeService;

	@PostMapping(value = "/saveemployee")
	public List<Employee> saveEmployee(@RequestBody List<Employee> employeeList) {

		Company company = new Company();
		company.setCompanyName("ratna global");
		for (Employee employee : employeeList) {
			employee.setCompany(company);
		}

		List<Employee> employeeResponse = employeeService.saveEmployee(employeeList);
		return employeeResponse;
	}

	@GetMapping(value = "/{employeeId}")
	public Employee getEmployeeDetails(@PathVariable int employeeId) {
		Employee employeeResponse = employeeService.findByEmployeeId(employeeId);

		return employeeResponse;
	}
	
	
	// creating post mapping that post the employee detail in the database

	@PostMapping("/employees")
	public int saveEmployee(@RequestBody Employee employees) {
		employeeService.saveOrUpdate(employees);
		return employees.getEmployeeId();
	}

	// creating a get mapping that retrieves the detail of a specific employee

	@GetMapping("/employee/{employeeid}")
	public Employee getEmployee(@PathVariable("employeeid") int employeeid)

	{

		return ((EmployeeServiceImp) employeeService).getEmployeeById(employeeid);
	}

	// creating a delete mapping that deletes a specified employee

	@DeleteMapping("/employee/{employeeid}")
	public void deleteEmployee(@PathVariable("employeeid") int employeeid) {
		employeeService.delete(employeeid);

	}

	// creating put mapping that updates the employee detail

	@PutMapping("/employees")
	public Employee update(@RequestBody Employee employees) {
		employeeService.saveOrUpdate(employees);
		return employees;
	}

	// creating a get mapping that retrives all the employee details from database

	@GetMapping("/employee")
	public List<Employee> getAllEmployees() {
		List<Employee> listemp = employeeService.getAllEmployees();
		return listemp;
	}

}// end of the class

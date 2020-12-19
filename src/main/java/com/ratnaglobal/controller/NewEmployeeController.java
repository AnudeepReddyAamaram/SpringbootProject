package com.ratnaglobal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ratnaglobal.model.Employee;
import com.ratnaglobal.repository.EmployeesRepository;
import com.ratnaglobal.service.NewEmployeeService;

@RestController
public class NewEmployeeController {

	@Autowired
	private NewEmployeeService employeeService;
	
	@Autowired
	private EmployeesRepository employeeRepository;
	
	
	
	@PostMapping(value = "/saveemp")
    public List<Employee> saveEmployee(@RequestBody List<Employee> employeeList) {
		List<Employee> employeeResponse = (List<Employee>) employeeService.saveEmployee(employeeList);
		return employeeResponse;
	}
	
	
	@GetMapping(value = "/emp")
	public List<Employee> getEmployeeDetails() {
		List<Employee> employeeResponse = (List<Employee>) employeeRepository.findAll();

		return employeeResponse;
	}
	
	
}


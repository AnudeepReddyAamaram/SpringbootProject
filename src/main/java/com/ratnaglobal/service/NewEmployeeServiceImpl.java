package com.ratnaglobal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratnaglobal.model.Employee;
import com.ratnaglobal.model.Laptops;
import com.ratnaglobal.repository.EmployeesRepository;

@Service
public class NewEmployeeServiceImpl implements NewEmployeeService {

	@Autowired
	private EmployeesRepository employeeRepository;

	public List<Employee> saveEmployee(List<Employee> employeeList) {

		// Use two employees which we are passing from postman
		Employee emp1 = employeeList.get(0);
		Employee emp2 = employeeList.get(1);

		// create laptops
		Laptops laptops1 = new Laptops();
		Laptops laptops2 = new Laptops();
		laptops1.setLaptopName("Dell");
		laptops2.setLaptopName("Lenovo");

		// populate Laptops
		emp1.getLaptops().add(laptops1);
		emp1.getLaptops().add(laptops2);
		emp2.getLaptops().add(laptops1);
		emp2.getLaptops().add(laptops2);

		// populate employees
		laptops1.getEmployee().add(emp1);
		laptops1.getEmployee().add(emp2);
		laptops2.getEmployee().add(emp1);
		laptops2.getEmployee().add(emp2);

		// Save owner entities
		List<Employee> employeeResponse = (List<Employee>) employeeRepository.saveAll(employeeList);

		return employeeResponse;

	}

	public Employee findByBookId(int employeeId) {
		Optional<Employee> employeeResponse = employeeRepository.findById(employeeId);
		Employee employee = employeeResponse.get();
		return employee;
	}

	

}

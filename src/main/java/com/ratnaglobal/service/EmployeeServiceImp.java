package com.ratnaglobal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratnaglobal.model.Employee;
import com.ratnaglobal.repository.EmployeesRepository;

//defining the business logic  
@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	EmployeesRepository employeesRepository;

	public List<Employee> saveEmployee(List<Employee> employeeList) {
		List<Employee> response = (List<Employee>) employeesRepository.saveAll(employeeList);
		return response;

	}

	public Employee findByEmployeeId(int employeeId) {
		Employee employee = employeesRepository.findByEmployeeId(employeeId);
		return employee;
	}

	// saving a specific record by using the method save() of jpaRepository
	public void saveOrUpdate(Employee employees) {
		employeesRepository.save(employees);
	}

	// getting a specific record by using the method findById() of jpaRepository
	public Employee getEmployeeById(int id) {
		return employeesRepository.findById(id).get();
	}

	// deleting a specific record by using the method deleteById() of jpaRepository
	public void delete(int id) {
		employeesRepository.deleteById(id);
	}

	// updating a record
	public void update(Employee employees, int employeeid) {
		employeesRepository.save(employees);
	}

	// getting all employee record by using the method findaAll() of jpaRepository
		public List<Employee> getAllEmployees() {
			List<Employee> employees = new ArrayList<Employee>();
			employeesRepository.findAll().forEach(employee1 -> employees.add(employee1));
			return employees;
		}

		
	
}// end of the class
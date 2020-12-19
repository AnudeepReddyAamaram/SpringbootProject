package com.ratnaglobal.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ratnaglobal.model.Employee;

@Component
public interface NewEmployeeService {
	
	
public List<Employee> saveEmployee(List<Employee> employeeList);
public Employee findByBookId(int employeeId);

	}


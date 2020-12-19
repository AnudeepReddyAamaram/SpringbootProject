package com.ratnaglobal.service;

import java.util.List;

import com.ratnaglobal.model.Employee;

public interface EmployeeService {
	public void saveOrUpdate(Employee employees);
	public Employee getEmployeeById(int id);
	public void delete(int id);
	public void update(Employee employees, int employeeid);
	public List<Employee> getAllEmployees();
	public List<Employee> saveEmployee(List<Employee> employee);
	public Employee findByEmployeeId(int employeeId);
}

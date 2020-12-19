package com.ratnaglobal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ratnaglobal.model.Employee;
@Repository
//repository that extends jpaRepository  
public interface EmployeesRepository extends JpaRepository<Employee,Integer> {

	 public Employee findByEmployeeId(int employeeId);

	

	



	
}

package com.ratnaglobal.model;

import java.util.HashSet; 
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//mark class as Entity
@Entity
//defining class name as Table name  
@Table(name = "Employe_Table")
public class Employee {
// Defining employee id as primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String employeename;
//=========================================================================================================
//onetoone 
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ep_fk")
	private Adharcard adharcard;
//=======================================================================================================	
	// oneToMany
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_fk")
	private List<Address> address;

//======================================================================================================
	// manytoone
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ec_fk")
	private Company company;
//==========================================================================================================
	// ManyToMany
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employees_laptops", joinColumns = @JoinColumn(name = "employees_id"), inverseJoinColumns = @JoinColumn(name = "laptops_id"))
	private Set<Laptops> laptops = new HashSet<>();

	public Employee() {
	}

	public Employee(int employeeId, String employeename) {
		super();
		this.employeeId = employeeId;
		this.employeename = employeename;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public Adharcard getAdharcard() {
		return adharcard;
	}

	public void setAdharcard(Adharcard adharcard) {
		this.adharcard = adharcard;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Set<Laptops> getLaptops() {
		return laptops;
	}

	public void setLaptops(Set<Laptops> laptops) {
		this.laptops = laptops;
	}

}

package com.ratnaglobal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int mobileno;
	private int flotno;
	private String city;

	public Address() {
	}

	public Address(int id, int mobileno, int flotno, String city) {
		super();
		this.id = id;
		this.mobileno = mobileno;
		this.flotno = flotno;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	public int getFlotno() {
		return flotno;
	}

	public void setFlotno(int flotno) {
		this.flotno = flotno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

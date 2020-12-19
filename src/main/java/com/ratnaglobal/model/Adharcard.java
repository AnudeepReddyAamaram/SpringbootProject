package com.ratnaglobal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.IntSequenceGenerator;

@Entity
@Table
public class Adharcard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer adharno;
	private String name;
	private Integer hno;

	public Adharcard() {
	
	}
	
	public Adharcard(Integer id, Integer adharno, String name, Integer hno) {
		super();
		this.id = id;
		this.adharno = adharno;
		this.name = name;
		this.hno = hno;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAdharno() {
		return adharno;
	}

	public void setAdharno(Integer adharno) {
		this.adharno = adharno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHno() {
		return hno;
	}

	public void setHno(Integer hno) {
		this.hno = hno;
	}

}
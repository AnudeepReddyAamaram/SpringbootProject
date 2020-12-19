package com.ratnaglobal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ratnaglobal.model.Laptops;
import com.ratnaglobal.repository.LaptopsRepository;

@RestController
public class LaptopsController {
	@Autowired
	private LaptopsRepository laptopsRepository;

	@GetMapping(value = "/laptops")
	public List<Laptops> getLaptopsDetails() {
		List<Laptops> laptopsresponse = (List<Laptops>) laptopsRepository.findAll();

		return laptopsresponse;
	}

}

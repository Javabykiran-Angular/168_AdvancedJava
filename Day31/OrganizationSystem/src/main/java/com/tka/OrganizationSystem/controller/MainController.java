package com.tka.OrganizationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.OrganizationSystem.entity.Country;
import com.tka.OrganizationSystem.service.MainService;

@RestController
@RequestMapping("/api")
public class MainController {
	
	@Autowired
	MainService service;

	//API 1
	@PostMapping("/addcountry")
	public String addcountry(@RequestBody Country c) {
		
		String msg= service.addcountry(c);
		return msg;			
	}
	//API 2
	
	@PutMapping("/updatecoutry")
	public String updateCountry(@RequestBody Country c) {
		
		String msg= service.updateCountry(c);
		return msg;
		
	}
	
	//API 3
	
	@DeleteMapping("/deletcountry/{id}")
	public String deleteCountry(@PathVariable int id) {
			
		String msg= service.deleteCountry(id);
		return msg;
	}
	
	//API 4
	
	@GetMapping("/getAllCountry")
	public List<Country> getAllCountry(){
		
		List<Country> list= service.getAllCountry();
		return list;
		
	}
	
	//API 4 
	
	@GetMapping("/getCountryById/{id}")
	public Country getCountryById(@PathVariable int id) {
		
		Country c= service.getCountryById(id);
		return c;
		
	}
	
	
	
	
}

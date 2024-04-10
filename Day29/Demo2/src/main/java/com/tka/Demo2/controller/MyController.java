package com.tka.Demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Demo2.entity.Person;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@PostMapping("/save")
	public String saveRecord(@RequestBody Person p) {
		
		System.out.println(p);
		
		return "Save success";
		
	}
	
	@GetMapping("/getrecord/{id}")
	public String GetParticularRecord(@PathVariable("id") int id1 ) {
		System.out.println(id1);
		return "Give the particular Record";
	}
	
//	@GetMapping("/getrecord1")
//	public String GetParticularRecord1(@RequestParam("id") int id1 ) {
//		System.out.println(id1);
//		
//		return "Give the particular Record";
//	}
//	
	
	@GetMapping("/getrecord1")
	public Person GetParticularRecord1(@RequestParam("id") int id1 ) {
		System.out.println(id1);
		Person p1=new Person("Sumit");
		p1.setId(90);
		return p1;
	}
	
	
	

}

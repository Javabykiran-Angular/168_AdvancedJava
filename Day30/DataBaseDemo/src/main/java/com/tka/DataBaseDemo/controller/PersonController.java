package com.tka.DataBaseDemo.controller;

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

import com.tka.DataBaseDemo.entity.Person;
import com.tka.DataBaseDemo.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonController {
	
	@Autowired
	PersonService service;
	
		@PostMapping("/addperson")
		public String AddPersonData(@RequestBody Person p) {
			
			String msg= service.AddPersonData(p);
			
			return msg;
			
		}
		
		@PutMapping("/updatedata/{id}")
		public String UpdatePerson(@PathVariable int id, @RequestBody Person p) {
			
			String msg= service.UpdatePerson(id,p);
			
			return msg;
		}
		
		@DeleteMapping("/deleteData/{id}")
		public String DeleteData(@PathVariable int id) {
			String msg= service.deleteData(id);
			return msg;
		}
		
		@GetMapping("/getAll")
		public List<Person> getAllData(){
			
			List<Person> list=service.getAllData();
			return list;
			
		}
		
		@GetMapping("/getDatById/{id}")
		public Person getParticularDataById(@PathVariable int id) {
			
			Person p=service.getParticularDataById(id);
			return p;
			
		}
		

}

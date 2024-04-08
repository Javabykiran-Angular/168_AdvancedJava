package com.tka.Demo1;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/firstapi")
	public void firstApi() {
		System.out.println("My First API is called....");
	}
	
	@GetMapping("/getdata")
	public void getMapping() {
		System.out.println("Get ampping method is work...");
	}
	
	@RequestMapping(value = "secondapi",method = RequestMethod.POST)
	public void secondApi() {
		System.out.println("My Second APi Is called ...");
	}
	
	@PostMapping(value = "/postmapping")
	public void postmapping() {
		System.out.println("Post mapping is called ...");
	}
	
	@RequestMapping(value = "/updatedata",method = RequestMethod.PUT)
	public void UpdateData() {
		System.out.println("Update data success.");
	}
	
	
	@PutMapping("/putdata")
	public void putData() {
		System.out.println("Put mapping data success.");
	}
	
	
	@RequestMapping(value = "/deletedata",method = RequestMethod.DELETE)
	public void deleteData() {
		System.out.println("Delete data success.");
	}
	
	@DeleteMapping("/deletemapping")
	public void deleteMapping() {
		System.out.println("Delete mapping Work.");
	}
	
	
	
}

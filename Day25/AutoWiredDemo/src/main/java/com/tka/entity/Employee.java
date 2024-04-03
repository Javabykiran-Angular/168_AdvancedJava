package com.tka.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	
	//@Autowired
	@Value("${myid}")
	int id;
	
	@Value("${name}")
	String name;
	
	@Autowired	
	Country con;
	
	
	public Employee() {
		
	}
	
	
	
	
	public Country getCon() {
		return con;
	}




	public void setCon(Country con) {
		this.con = con;
	}




//	@Autowired
//	public Employee(@Value("8") int id,@Value("Sumit") String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}


	public Employee(String name) {
		super();
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", con=" + con + "]";
	}
	
	
	
	

}

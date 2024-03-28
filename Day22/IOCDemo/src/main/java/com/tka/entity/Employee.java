package com.tka.entity;

public class Employee {
	
	String name;
	String lname;
	
	public Employee() {
		
	}
	
	public Employee(String name, String lname) {
		super();
		this.name = name;
		this.lname = lname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", lname=" + lname + "]";
	}
//	
	

}

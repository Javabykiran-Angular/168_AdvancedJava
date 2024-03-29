package com.tka.entity;

public class Employee {
	
	String name;
	int id;
	
	Country country;
	
	
	public Employee() {
		
	}
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId1(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", country=" + country + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", id=" + id + "]";
//	}
	
	
	
	
	
	

}

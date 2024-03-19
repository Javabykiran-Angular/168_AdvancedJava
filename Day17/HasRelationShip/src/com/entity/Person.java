package com.entity;

public class Person {
	
	String name;
	String gender;
	
	// Reference 
	Address addr;
	
	public Person() {
		
	}
	
	public Person(String name, String gender,Address addr) {
		this.name=name;
		this.gender=gender;
		this.addr=addr;
	}

	public Person(String name, String gender,String city,String area) {
		super();
		this.name = name;
		this.gender = gender;
		addr=new Address(city, area);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", addr=" + addr + "]";
	}
	
	

}

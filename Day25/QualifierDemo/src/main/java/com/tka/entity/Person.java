package com.tka.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tka.utility.Sim;

@Component
public class Person {
	
	int id;
	String name;
	
	@Autowired
	@Qualifier("airtel")
	Sim sim1;
	
	@Autowired
	@Qualifier("jio")
	Sim sim2;
	
	
	
	
	public Sim getSim2() {
		return sim2;
	}

	public void setSim2(Sim sim2) {
		this.sim2 = sim2;
	}

	public Sim getSim1() {
		return sim1;
	}

	public void setSim1(Sim sim1) {
		this.sim1 = sim1;
	}

	public Person() {
		
	}
	
	public Person(String name) {
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
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	

}

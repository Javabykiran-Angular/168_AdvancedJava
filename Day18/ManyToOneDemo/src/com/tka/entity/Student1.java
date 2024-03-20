package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	
	@ManyToOne
	@JoinColumn(name = "l_id")
	Laptop1 laptop1;
	
	
	public Student1() {
		
	}
	

	public Student1(String name, Laptop1 laptop1) {
		super();
		this.name = name;
		this.laptop1 = laptop1;
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

	public Laptop1 getLaptop1() {
		return laptop1;
	}

	public void setLaptop1(Laptop1 laptop1) {
		this.laptop1 = laptop1;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", laptop1=" + laptop1 + "]";
	}
	
	
	
	
	
	

}

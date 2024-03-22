package com.tka.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToMany(mappedBy = "laptop",fetch = FetchType.EAGER)
	List<Student> stude_list;
	
	
	public Laptop() {
		
	}
	
	public Laptop(String name) {
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
	
	
	
	
	public List<Student> getStude_list() {
		return stude_list;
	}

	public void setStude_list(List<Student> stude_list) {
		this.stude_list = stude_list;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", stude_list=" + stude_list + "]";
	}

	
	
	

}

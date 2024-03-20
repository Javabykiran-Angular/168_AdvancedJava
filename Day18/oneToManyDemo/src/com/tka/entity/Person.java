package com.tka.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String Name;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn
	List<Address> list;
	
	
	public Person() {
		
	}

	public Person(String name, List<Address> list) {
		super();
		Name = name;
		this.list = list;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public List<Address> getList() {
		return list;
	}


	public void setList(List<Address> list) {
		this.list = list;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", Name=" + Name + ", list=" + list + "]";
	}
	
	
	

}

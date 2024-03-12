package com.tka.entity;

public class Employee {
	int id;
	String fname;
	String mobileno;
	
	
	public Employee() {
		
	}
	
	
	public Employee(int id, String fname, String mobileno) {
		super();
		this.id = id;
		this.fname = fname;
		this.mobileno = mobileno;
	}
	public Employee( String fname, String mobileno) {
		super();
		
		this.fname = fname;
		this.mobileno = mobileno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", mobileno=" + mobileno + "]";
	}
	

}

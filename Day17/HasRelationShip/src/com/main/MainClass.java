package com.main;

import com.entity.Address;
import com.entity.Person;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person person=new Person("Sumit", "male", "Pune", "Karvenagar");
//		System.out.println(person);
		
		Address addr=new Address("Satara","Sainik School");
		
		Person person=new Person("Sumit", "Male", addr);
		System.out.println(person);
		

	}

}

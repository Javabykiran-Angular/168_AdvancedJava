package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tka.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
		
		Employee e= context.getBean("myemp", Employee.class);
		
		e.setLname("Raokhande");
		e.setName("Sumit");
		
		System.out.println(e);

	}

}

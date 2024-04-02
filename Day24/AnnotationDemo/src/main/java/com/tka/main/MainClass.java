package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.entity.Country;
import com.tka.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Configuration.class);
		
//			Employee e= context.getBean(Employee.class);
//			System.out.println(e);
		
//		Employee e= context.getBean("myemp", Employee.class);
//		System.out.println(e);
//		
//		Employee e1= context.getBean("myemp", Employee.class);
//		System.out.println(e1);
//		
//		Country c= context.getBean("country",Country.class);
//		System.out.println("====> "+c);
//		
		
//		Employee emp1= context.getBean(Employee.class);
//		System.out.println(emp1);
		
		Country con1= context.getBean(Country.class);
		System.out.println(con1);
		
		Employee e2= context.getBean("employee1",Employee.class);
		System.out.println("Employee Object=> "+e2);
		
		

	}

}

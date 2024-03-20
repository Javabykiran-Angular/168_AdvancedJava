package com.tka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Address;
import com.tka.entity.Person;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Address.class);
		config.addAnnotatedClass(Person.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
//		
//		Address add1=new Address("Karvenagar","Pune");
//		Address add2=new Address("Ramakona","chhindawara");
//		Address add3=new Address("Char Batti","Delhi");
//		
//		List<Address> list=new ArrayList<Address>();
//		list.add(add1);
//		list.add(add3);
//		
//		Person p=new Person();
//		p.setName("Sumit");
//		p.setList(list);
//		
//		session.persist(add1);
//		session.persist(add2);
//		session.persist(add3);
//		
//		session.persist(p);
		
		Person per= session.get(Person.class, 1);
		
		
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println(per);
		
		
		

	}

}

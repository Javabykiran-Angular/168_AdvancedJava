package com.tka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Laptop;
import com.tka.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Laptop.class);
		config.addAnnotatedClass(Student.class);
		
		SessionFactory factory=config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
	//	Laptop lap1=new Laptop("Dell");
//		Laptop lap2=new Laptop("HP");
//		Laptop lap3=new Laptop("Accer");
		
	//	Laptop lap= session.get(Laptop.class, 1);
		
		//List<Laptop> list=new ArrayList<Laptop>();
		//list.add(lap1);
		//list.add(lap2);
	//	list.add(lap);
		
//		Student stud=new Student();
//		stud.setName("Kiran");
//		stud.setLaptop(list);
		
		//session.persist(lap1);
		//session.persist(lap2);
		//persist(lap3);
		
	//	session.persist(stud);
		
	//	Student s= session.get(Student.class, 1);
		
	//	Student sdata= session.get(Student.class, 1);
		
	//	List<Laptop> stud_lapi= sdata.getLaptop();
		
		Laptop ldata=session.get(Laptop.class, 1);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Data addedd");
		
		//System.out.println(s);
		
//		System.out.println(laptData);
		
//		for(Laptop l:stud_lapi) {
//			System.out.println(l);
//		}
		
		System.out.println(ldata);
		

	}

}

package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Song;

public class Updatemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		SessionFactory factory= config.buildSessionFactory();
		int id=2;
		Session session= factory.openSession();
		session.beginTransaction();
		
		// Hibernate 5 load method 
		
		// Hibernate 6 get method
		Song songdata= session.get(Song.class,id);
		
		songdata.setName("kesariya.....");
		
		System.out.println(songdata);
		
		//Hibernate 5 update method 
		
		//Hibernate 6 merge method
		session.merge(songdata);
		
		session.getTransaction().commit();
		session.close();
		

	}

}

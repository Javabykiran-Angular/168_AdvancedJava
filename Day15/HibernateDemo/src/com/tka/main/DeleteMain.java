package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Song;

public class DeleteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		
		session.beginTransaction();
		
		Song sondata= session.get(Song.class, 1);
		
		//  hibernate 5 Version delete method
		
		//  hibernate 6 Version remove method
		session.remove(sondata);
		
		session.getTransaction().commit();
		session.close();
		
		
		
		

	}

}

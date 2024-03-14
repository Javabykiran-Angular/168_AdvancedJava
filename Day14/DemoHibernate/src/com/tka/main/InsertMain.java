package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Song;
import com.tka.entity.Student;

public class InsertMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(Song.class);
		SessionFactory factory= config.buildSessionFactory();
		
		Session session= factory.openSession();
		
		session.beginTransaction();
		
//		Student s=new Student();
//		s.setUsername("Ganesh");
//		s.setPassword("ganesh123");
		
		Song song=new Song();
		song.setName("Mehiboo mehobooba");
		song.setArtist("R D Burban");
		
		
//		
//		session.save(s);
		session.persist(song);
		
		session.getTransaction().commit();
		System.out.println("Data is Inserted...");
		session.close();
			
		
		
		

	}

}

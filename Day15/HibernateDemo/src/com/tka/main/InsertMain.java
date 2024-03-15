package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Song;

public class InsertMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		
			Session session= factory.openSession();
			session.beginTransaction();
			
			Song song=new Song();
			song.setName("Mehbooba Mehbooba ");
			song.setArtist("R D Burman");
			
			// It is used in Hibernate 5 Version
			// session.save(song);
			
			//It is used in hibernate 6 Version
			session.persist(song);
			
			session.getTransaction().commit();
			
			session.close();
			
			
			
		
		

	}

}

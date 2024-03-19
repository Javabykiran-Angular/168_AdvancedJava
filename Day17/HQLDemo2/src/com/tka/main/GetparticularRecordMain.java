package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;

import com.tka.entity.Song;

import jakarta.persistence.Query;

public class GetparticularRecordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		
		String hqlQuery="from Song where id=:id";
		
		// Use Hibernate Query Object 
//		Query<Song> query= session.createQuery(hqlQuery,Song.class);
//		
//		query.setParameter("id", 4);
//		
//		Song song= query.uniqueResult();
		
		// Use JPA Query Object 
		
		Query query= session.createQuery(hqlQuery,Song.class);
		
		query.setParameter("id", 4);
		
		 Song song= (Song) query.getSingleResult();
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println(song);
		
		

	}

}

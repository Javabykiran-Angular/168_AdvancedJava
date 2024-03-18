package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.tka.entity.Song;

public class UpdateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();		
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		String hqlQuery="update Song set name=:myname, artist=:mysinger where id=:myid";
		// Hibernate 5
//		Query<Song> query= session.createQuery(hqlQuery);
		
		// Hibernate 6
		Query<Song> query= session.createQuery(hqlQuery,Song.class);
			
		query.setParameter("myname", "Kesariya.... Kesariya......");
		query.setParameter("mysinger", "arjit Singh");
		query.setParameter("myid", 2);
		
		query.executeUpdate();
		
//		MutationQuery MQuery= session.createMutationQuery(hqlQuery);
//		
//		MQuery.setParameter("myname", "Kesariya Kesariya......");
//		MQuery.setParameter("mysinger", "arjit singh");
//		MQuery.setParameter("myid", 2);
		
		//MQuery.executeUpdate();
		
		session.getTransaction().commit();
		session.close();
		
		
		
		
			
	}

}

package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

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
		
		String hqlQuery="delete Song where id=:myid";
		
		MutationQuery Mquery= session.createMutationQuery(hqlQuery);
		
		Mquery.setParameter("myid", 3);
				
		Mquery.executeUpdate();
		
		session.getTransaction().commit();
		session.close();
		
		
		

	}

}

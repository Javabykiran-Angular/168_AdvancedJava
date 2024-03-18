package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
// import org.hibernate.query.Query;
import jakarta.persistence.Query;

import com.tka.entity.Song;



public class GetParticularRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Configuration config=new Configuration();		
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		String hqlquery="from Song where id=:myid";
	
		
		//MutationQuery mQuery= session.createMutationQuery(hqlquery);
		
		//mQuery.setParameter("myid", 4);
		
		//Hibernate Query Object 
		//Query<Song> query=  session.createQuery(hqlquery,Song.class);
		
		//JPA Hibernate Query Object 
		Query query=  session.createQuery(hqlquery,Song.class);
		
		query.setParameter("myid", 4);
		
		//Song s= query.uniqueResult();
		
		Song s= (Song) query.getSingleResult();
		
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println(s);
		
	
		

	}

}

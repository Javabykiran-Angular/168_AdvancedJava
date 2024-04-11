package com.tka.DataBaseDemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.DataBaseDemo.entity.Person;

@Repository
public class PersonDao {
	
	@Autowired
	SessionFactory factory;

	public String AddPersonData(Person p) {
		Session session= factory.openSession();
		session.beginTransaction();
		session.persist(p);
		session.getTransaction().commit();
		session.close();
		return "Data Addess Successfully";
	}

	public String UpdatePerson(int id, Person p) {
		// TODO Auto-generated method stub
		
		Session session= factory.openSession();	
		session.beginTransaction();
		
		Person personData= session.get(Person.class,id);
		personData.setName(p.getName());
		personData.setEmailid(p.getEmailid());
		personData.setMobileno(p.getMobileno());
		
		session.merge(personData);
		session.getTransaction().commit();
		session.close();
		
		return "Data updated successfully";
	}

	public String deleteData(int id) {
		// TODO Auto-generated method stub
		
		Session session= factory.openSession();		
		session.beginTransaction();
		
		Person p=session.get(Person.class, id);
		session.remove(p);
		session.getTransaction().commit();
		session.close();
		
		return "Data Deleted Successfully";
	}

	public List<Person> getAllData() {
		
		Session session= factory.openSession();
		session.beginTransaction();
		
		String hqlQuery="from Person";
		
		Query<Person> query= session.createQuery(hqlQuery,Person.class);
		
		List<Person> list= query.list();
		session.getTransaction().commit();
		session.close();	
		
		return list;		
		
	}

	public Person getParticularDataById(int id) {
		// TODO Auto-generated method stub
		
		Session session= factory.openSession();
		session.beginTransaction(); 
		
		Person p=session.get(Person.class, id);
		session.getTransaction().commit();
		session.close();	
		
		return p;
	}

	
}

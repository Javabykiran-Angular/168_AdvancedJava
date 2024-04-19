package com.tka.DemoMVC.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.DemoMVC.entity.Person;
import com.tka.DemoMVC.entity.User;

@Repository
public class UserDao {
	
	@Autowired
	SessionFactory factory;

	public User checkUser(User user) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		
		User myuser=null;
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			String hql="from User where username=:username and password=:password";
			
			Query<User> query= session.createQuery(hql,User.class);
			query.setParameter("username",user.getUsername() );
			query.setParameter("password", user.getPassword());
			
			 myuser= query.uniqueResult();
			
			tx.commit();
		
		}catch (Exception e) {
			// TODO: handle exception
			
			if(tx!=null) {
				tx.rollback();
			}
			
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return myuser;
		
		
	}

	public List<Person> getAllRecord() {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Person> list=null;
		String hql="from Person";
		
		try {
			
			session=factory.openSession();
			
			tx=session.beginTransaction();
			
			Query<Person> query= session.createQuery(hql,Person.class);
			list= query.list();
			tx.commit();
			
		}catch (Exception e) {
			// TODO: handle exception
			
			if(tx!=null) {
				tx.rollback();
			}
			
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return list;
		
	}

	public Person getparticulardata(int id) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		Person person=null;
	
		

		try {
			
			session=factory.openSession();
			
			tx=session.beginTransaction();
			
			person= session.get(Person.class, id);
			tx.commit();
			
			
			
		}catch (Exception e) {
				// TODO: handle exception
				
				if(tx!=null) {
					tx.rollback();
				}
				
				e.printStackTrace();
			}finally {
				if(session!=null) {
					session.close();
				}
			}
		return person;
	}

}

package com.tka.OrganizationSystem.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.OrganizationSystem.entity.Country;
import com.tka.OrganizationSystem.entity.Employee;

@Repository
public class MainDao {
	
	@Autowired
	SessionFactory factory;

	public String addcountry(Country c) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		String msg=null;
		
		try {		
		session=factory.openSession();
		tx=session.beginTransaction();
		
		session.persist(c);
		tx.commit();
		msg="Country Added Successfully";
		
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
			
		
		return msg;
	}

	public String updateCountry(Country c) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		String msg=null;
		
		try {		
		session=factory.openSession();
		tx=session.beginTransaction();
		
		Country country= session.get(Country.class, c.getCid());
		
		country.setCname(c.getCname());		
		session.merge(country);
		tx.commit();
		msg="Country is Updatated Successfully...";
			
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
		
		
		return msg;
	}

	public String deleteCountry(int id) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		String msg=null;
		
		try {		
		session=factory.openSession();
		tx=session.beginTransaction();
		
		Country country= session.get(Country.class, id);
		
		session.remove(country);
		
		tx.commit();
		msg="Country is Deleted Successfully...";
		
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
		
		
		return msg;
	}

	public List<Country> getAllCountry() {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Country> list=null;
		String hqlQuery="from Country";
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			
			Query<Country> query= session.createQuery(hqlQuery,Country.class); 
			
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

	public Country getCountryById(int id) {
		// TODO Auto-generated method stub
		
		Session session=null;
		Transaction tx=null;
		Country c=null;
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			
			c= session.get(Country.class, id);
			
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
		
		
		return c;
	}

	public String addEmployee(Employee emp) {
		// TODO Auto-generated method stub		

		Session session=null;
		Transaction tx=null;
		String msg=null;
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			session.persist(emp);
			tx.commit();
			msg="Employee Added Successfully...";
			
			
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
		
		
		return msg;
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		
		Session session=null;
		Transaction tx=null;
		List<Employee> list=null;
		String hqlQuery="from Employee";
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			
			Query<Employee> query= session.createQuery(hqlQuery,Employee.class);
			
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

		
	
}

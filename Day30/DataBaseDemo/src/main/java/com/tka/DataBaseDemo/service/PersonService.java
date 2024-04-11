package com.tka.DataBaseDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.DataBaseDemo.dao.PersonDao;
import com.tka.DataBaseDemo.entity.Person;

@Service
public class PersonService {
	
	@Autowired
	PersonDao dao;
	
	public String AddPersonData(Person p) {
		String msg= dao.AddPersonData(p);
		return msg;
	}

	public String UpdatePerson(int id, Person p) {
		// TODO Auto-generated method stub
		String msg= dao.UpdatePerson(id,p);
		return msg;
	}

	public String deleteData(int id) {
		// TODO Auto-generated method stub
		String msg= dao.deleteData(id);
		return msg;
	}

	public List<Person> getAllData() {
		// TODO Auto-generated method stub
		
		List<Person> list= dao.getAllData();
		
		return list;
	}

	public Person getParticularDataById(int id) {
		// TODO Auto-generated method stub
		Person p= dao.getParticularDataById(id);
		return p;
	}

}

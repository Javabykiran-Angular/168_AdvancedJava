package com.tka.OrganizationSystem.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.OrganizationSystem.dao.MainDao;
import com.tka.OrganizationSystem.entity.Country;

@Service
public class MainService {
	
	@Autowired
	MainDao dao;
	
	public String addcountry(Country c) {
		
		String msg= dao.addcountry(c);
		if(Objects.isNull(msg)) {
			msg="Country is not added....";
		}
		
		return msg;
		
	}

	public String updateCountry(Country c) {
		// TODO Auto-generated method stub
		
		String msg= dao.updateCountry(c);
		if(Objects.isNull(msg)) {
			msg="Country is not Updatated....";
		}
		
		return msg;
	}

	public String deleteCountry(int id) {
		// TODO Auto-generated method stub
		
		String msg=dao.deleteCountry(id);
		if(Objects.isNull(msg)) {
			msg="Country is not deleted....";
		}
		
		return msg;
	}

	public List<Country> getAllCountry() {
		// TODO Auto-generated method stub
		
		List<Country> list= dao.getAllCountry();
		
		if(Objects.isNull(list)) {
			list=null;
		}
		
		return list;
	}

	public Country getCountryById(int id) {
		// TODO Auto-generated method stub
		
		Country c= dao.getCountryById(id);
		if(Objects.isNull(c)) {
			c=null;
		}
		
		return c;
	}
	
	
}

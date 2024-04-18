package com.tka.DemoMVC.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.DemoMVC.dao.UserDao;
import com.tka.DemoMVC.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserDao dao;

	public String checkUser(User user) {
		// TODO Auto-generated method stub
		String msg=null;
		User u= dao.checkUser(user);
		
		if(Objects.isNull(u)) {
			msg="Invalid User";
		}else {
			msg="valid User";
		}
		
		return msg;
		
		
	}
	
	

}

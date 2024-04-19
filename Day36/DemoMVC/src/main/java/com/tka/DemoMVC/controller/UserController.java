package com.tka.DemoMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.DemoMVC.entity.Person;
import com.tka.DemoMVC.entity.User;
import com.tka.DemoMVC.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;

	@PostMapping("/login")
	public String checkUser(@ModelAttribute User user,Model model) {
		//System.out.println(user);
		
		String msg= service.checkUser(user);
		
		if(msg.equalsIgnoreCase("valid user")) {
			
			List<Person> list= service.getAllRecord();
			model.addAttribute("personlist", list);
			return "home";
		}else {
			return "login";
		}
		
	}
	
	@GetMapping("/getparticurlardata/{id}")
	public String getparticulardata(@PathVariable int id,Model model) {
		//System.out.println(id);
		
		Person p= service.getparticulardata(id);
		model.addAttribute("persondata",p);
		
		return "update";
		
		
	}
	
	
	
	
}

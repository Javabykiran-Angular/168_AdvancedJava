package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.config.Myconfiguration;
import com.tka.entity.Account;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Myconfiguration.class);
		
		Account acc= context.getBean(Account.class);
		
	//	acc.deposit();
		
	//	acc.withdraw();
		
		acc.deposit1(5000.0);
		
//		System.out.println(acc);

	}

}

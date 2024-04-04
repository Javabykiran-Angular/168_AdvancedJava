package com.tka.entity;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	public void deposit() {
		
		System.out.println("U r deposit the Amount successfully....");
		
	}
	
	public void deposit1(Double amt) {
		System.out.println("U r deposit the Amount"+amt+" successfully....");
	}
	
	public void withdraw() {
		System.out.println("U r withdraw the Amount successfully....");
	}

}

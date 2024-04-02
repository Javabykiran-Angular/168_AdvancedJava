package com.tka.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.tka.entity.Country;
import com.tka.entity.Employee;

@ComponentScan(basePackages = {"com.tka"})
public class Configuration {
	
//	@Bean("myemp")
//	@Scope("prototype")
//	public Employee getEmployee() {
//		Employee emp=new Employee();
//		return emp;
//	}
//	
//	@Bean("country")
//	public Country getCountry() {
//		Country con=new Country();
//		return con;
//	}
//	
	

}

package com.tka.main;

import java.util.ArrayList;

import com.tka.dao.EmployeeDAO;
import com.tka.entity.Employee;

public class GetAllRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao=new EmployeeDAO();
		
		ArrayList<Employee> list= dao.getAllData();
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		

	}

}

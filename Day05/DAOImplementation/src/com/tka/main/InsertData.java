package com.tka.main;

import com.tka.dao.EmployeeDAO;
import com.tka.entity.Employee;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao=new EmployeeDAO();
		
		Employee e=new Employee();
		e.setFname("Swapnil");
		e.setMobileno("7894563214");
		
		
		int status= dao.insertData(e);
		
		if(status>0) {
			System.out.println("Data is inserted...");
		}else {
			System.out.println("Data is not inserted...");
		}		
		

	}

}

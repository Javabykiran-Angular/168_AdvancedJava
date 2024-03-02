package com.tka.main;

import com.tka.dao.EmployeeDAO;
import com.tka.entity.Employee;

public class UpdateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao=new EmployeeDAO();
		
		Employee e=new Employee();
		e.setId(2);
		e.setMobileno("123");
		
		int status= dao.UpdateData(e);
		if(status>0) {
			System.out.println("Data is Updatated");
		}else {
			System.out.println("Data is Not Updatated");
		}
		

	}

}

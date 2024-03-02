package com.tka.main;

import com.tka.dao.EmployeeDAO;

public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao=new EmployeeDAO();
		
		int status= dao.deleteData(4);
		if(status>0) {
			System.out.println("Data is deleted");
		}else {
			System.out.println("Data is Not  deleted");
		}
		
		

	}

}

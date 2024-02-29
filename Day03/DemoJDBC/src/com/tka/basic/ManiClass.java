package com.tka.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ManiClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/168batch", "root", "Sumit@123");
			
			Statement stmt= connection.createStatement();
			
			int status= stmt.executeUpdate("insert into employee(fname,mobileno) values('Rohit','9874569852')");
			
			if(status>0) {
				System.out.println("Data is inserted successfully...");
			}else {
				System.out.println("Data is not inserted successfully...");
			}
//			
			
			
			
			
			connection.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}

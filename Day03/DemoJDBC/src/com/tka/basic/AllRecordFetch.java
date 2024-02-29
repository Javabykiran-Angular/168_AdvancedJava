package com.tka.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AllRecordFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/168batch", "root", "Sumit@123");
			
				Statement stmt= con.createStatement();
				
				 ResultSet rs= stmt.executeQuery("select * from employee");
				 
				 while(rs.next()) {
					 int myid= rs.getInt("id");
					 String fname= rs.getString("fname");
					 String MobileNo= rs.getString("mobileno");
					 
					 System.out.println("Id is "+myid+" Fname is :: "+fname+" Mobile No "+MobileNo);
				 }
			
				rs.close();
				con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		

	}

}

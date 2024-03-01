package com.tka.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectAllRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/168batch", "root", "Sumit@123");
			
			PreparedStatement stmt= con.prepareStatement("select * from employee");
			
			ResultSet rs= stmt.executeQuery();
			
			while(rs.next()) {
				
				int id= rs.getInt("id");
				String fname= rs.getString("fname");
				String mobileno= rs.getString("mobileno");
				
				System.out.println("Id=> "+id+"\t Fname "+fname+"\t Mobile No "+mobileno);
				
			}
			
			rs.close();
			con.close();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		

	}

}

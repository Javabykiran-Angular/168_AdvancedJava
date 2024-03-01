package com.tka.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.tka.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/168batch", "root", "Sumit@123");
			
			PreparedStatement stmt= con.prepareStatement("insert into employee(fname,mobileno) values(?,?)");
			
			Employee e=new Employee("Sarang", "8521479632");
			
			stmt.setString(1, e.getFname());
			stmt.setString(2, e.getMobileno());
			
			int status= stmt.executeUpdate();
			if(status>0) {
				System.out.println("Data is Inserted..");
			}else {
				System.out.println("Data is not Inserted..");
			}
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

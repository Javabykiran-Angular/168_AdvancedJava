package com.tka.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/168batch", "root","Sumit@123");
			 
//			PreparedStatement stmt=	 con.prepareStatement("insert into employee(fname,mobileno) values('Sumit','9960556397')");
			
			
			PreparedStatement stmt=	 con.prepareStatement("insert into employee(fname,mobileno) values(?,?)");
			
			stmt.setString(1, "Trembal");
			stmt.setString(2, "7412589631");				
			
			int status= stmt.executeUpdate();
			
			if(status>0) {
				System.out.println("Data is Inserted ...");
			}else {
				
				System.out.println("Data is Not Inserted ...");
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

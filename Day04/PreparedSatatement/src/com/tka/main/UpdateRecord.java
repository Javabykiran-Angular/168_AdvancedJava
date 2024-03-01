package com.tka.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/168batch", "root", "Sumit@123");
				
				PreparedStatement stmt=	 con.prepareStatement("update employee set fname=? where id=?");
				
				stmt.setString(1, "Treyambak");
				stmt.setInt(2, 6);
				
				int status= stmt.executeUpdate();
				if(status>0) {
					System.out.println("Data is Updatated ....");
				}else {
					System.out.println("Data is not  Updatated ....");
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

package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tka.entity.Student;

public class StudentDao {
	
	final String Connection_Driver_Name="com.mysql.cj.jdbc.Driver";
	final String DB_Url="jdbc:mysql://localhost:3306/168batch";
	final String DB_User="root";
	final String DB_Password="Sumit@123";
	
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	
	// Setp 1&2
		public void openDB() {
			
			try {
				Class.forName(Connection_Driver_Name);
				
				con=DriverManager.getConnection(DB_Url, DB_User, DB_Password);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		
		public Student checkUser(String username,String pwd) {
			
			String query="select * from student where username=? and password=?";
			Student s=null;
			try {
			openDB();
			stmt= con.prepareStatement(query);
			stmt.setString(1, username);
			stmt.setString(2, pwd);
			
			rs= stmt.executeQuery();
			
			while(rs.next()) {
				s=new Student();
				s.setUsername(rs.getString("username"));
				s.setPassword(rs.getString("password"));
			}
			
			
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				closeDB();
			}
			
			return s;
			
			
		}
		
		
		// Step 5 		
		public void closeDB() {
			
			try{
				if(con!=null) {
					con.close();
				}
				
				if(stmt!=null) {
					stmt.close();
				}
				
				if(rs!=null) {
					rs.close();
				}
				
				
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
			
		}
		
	

}

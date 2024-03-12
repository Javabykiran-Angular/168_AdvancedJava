package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Employee;

public class EmployeeDao {
	
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
			
	public List<Employee> getAllRecords() {
		
		String query="select * from employee";
		List<Employee> list=new ArrayList<Employee>();
		
		try {
			openDB();
			
			stmt=con.prepareStatement(query);
			rs= stmt.executeQuery();
			
			while(rs.next()) {
				
				Employee e=new Employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setMobileno(rs.getString("mobileno"));
				list.add(e);				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
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

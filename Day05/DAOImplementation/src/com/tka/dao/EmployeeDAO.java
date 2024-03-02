package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tka.entity.Employee;

public class EmployeeDAO {
	
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
	
	
	public int insertData(Employee emp) {
		
		String query="insert into employee(fname,mobileno) values(?,?)";
		int status=0;
				
		try {
			openDB();
			stmt=con.prepareStatement(query);
			
			stmt.setString(1, emp.getFname());
			stmt.setString(2, emp.getMobileno());
			
			status= stmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			closeDB();
		}
		
		return status;
		
	}
	
	public int UpdateData(Employee emp) {
		
		String query="update employee set mobileno=? where id=?";
		
		int status=0;
		
		try {
		openDB();
		 stmt= con.prepareStatement(query);
		 
		 stmt.setString(1, emp.getMobileno());
		 stmt.setInt(2, emp.getId());
		 
		status= stmt.executeUpdate();
		 
		 
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			closeDB();
		}
		 
		return status;	
		
		
	}
	
	public int deleteData(int id) {
		String query="delete from employee where id=?";
		int Status=0;
		try {
		openDB();
		
			stmt= con.prepareStatement(query);
			
			stmt.setInt(1, id);
		
			Status= stmt.executeUpdate();
			
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			closeDB();
		}
		
		return Status;
		
		
	}
	
	
	public ArrayList<Employee> getAllData() {
		
		String query="select * from employee";
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		
			try {
				openDB();
				 stmt= con.prepareStatement(query);
				 
				 rs= stmt.executeQuery();
				 
				 	while(rs.next()) {
				 		Employee emp=new Employee();
				 		
				 		emp.setId(rs.getInt("id"));
				 		emp.setFname(rs.getString("fname"));
				 		emp.setMobileno(rs.getString("mobileno"));
				 		
				 		list.add(emp);
				 		
				 	}
				 
				 
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				closeDB();
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

package com.tka.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("U r in init Method......");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("U r in destroy Method......");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			System.out.println("U r in doGet Method......");
			String myusername= request.getParameter("username");
			System.out.println("Parameter Data is  => "+myusername);
			String pwd= request.getParameter("password");
			System.out.println("Password :: "+pwd);
			
			
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("U r in doPost Method......");
		String myusername= request.getParameter("username");
		System.out.println("Parameter Data is  => "+myusername);
		String pwd= request.getParameter("password");
		System.out.println("Password :: "+pwd);
		
		StudentDao dao=new StudentDao();
		Student s= dao.checkUser(myusername, pwd);
		
		PrintWriter pw= response.getWriter();
		
		
		if(s!=null) {
			System.out.println("valid User");
			pw.print("valid User");
		}else {
			System.out.println("Invalid User");
			pw.print("Invalid User");
		}
		
	}

}

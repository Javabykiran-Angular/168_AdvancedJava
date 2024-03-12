package com.tka.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		System.out.println("Login Servlet....");
		
		String myusername= request.getParameter("username");
		System.out.println("Parameter Data is  => "+myusername);
		String pwd= request.getParameter("password");
		System.out.println("Password :: "+pwd);
		
		StudentDao dao=new StudentDao();
		Student s= dao.checkUser(myusername, pwd);
		HttpSession session= request.getSession();
		if(s!=null) {
			System.out.println("valid User");	
			
			session.setAttribute("user", s.getUsername());
			response.sendRedirect("DashboardServlet");
			
		}else {
			
			RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
			response.setContentType("text/html");
			response.getWriter().print("<h2>Invalid User</h2>");
			rd.include(request, response);
			System.out.println("Invalid User");
	
			
		}
		
		
	}

}

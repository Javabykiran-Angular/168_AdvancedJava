package com.tka.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

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
		
		String username= request.getParameter("username");
		String pwd= request.getParameter("password");
		
		StudentDao dao=new StudentDao();
		Student stud= dao.checkUser(username, pwd);
		
		PrintWriter pw= response.getWriter();
		
		
		if(stud!=null) {
			//RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
			System.out.println("valid User");
			
			HttpSession session= request.getSession();
			session.setAttribute("user", stud.getUsername());
			
			response.sendRedirect("WelcomeServlet");
			
			
			//rd.forward(request, response);
		}else {
			RequestDispatcher rd= request.getRequestDispatcher("login.html");
			
			pw.print("<h2 style='color:red;' >In Valid User</h2>");
			
			response.setContentType("text/html");
			
			rd.include(request, response);
			
			System.out.println("In valid User");
		}
		
		
		
	}

}

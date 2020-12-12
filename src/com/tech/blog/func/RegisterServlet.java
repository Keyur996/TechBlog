package com.tech.blog.func;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class RegisterServlet  extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String username=req.getParameter("username");
		String pass=req.getParameter("pass");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		
		out.println("<title>Welcome</title>");
		out.println("<h1> User Data </h1>");
		out.println("<p>UserName: " + username + "</p>");
		out.println("<p>Password: " + pass + "</p>");
		out.println("<p>Email: " + email + "</p>");
		out.println("<p>Gender: " + gender + "</p>");
	}
	
}

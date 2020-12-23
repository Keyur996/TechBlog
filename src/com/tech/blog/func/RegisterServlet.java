package com.tech.blog.func;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tech.blog.dao.UsersDao;
import com.tech.blog.helper.Database;
import com.tech.blog.vo.Users;


@SuppressWarnings("serial")
public class RegisterServlet  extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String username=req.getParameter("user_name");
		String pass=req.getParameter("user_pass");
		String email=req.getParameter("user_email");
		String gender=req.getParameter("user_gender");
		String about=req.getParameter("user_about");
		//Collected data mapped with vo
		try {
			Users user= new Users(username, pass, email, gender, about);
			// Connect to database
			UsersDao dao = new UsersDao(Database.connect());
			// Create Into database
			int result=dao.create(user);
			if(result != 0) {
				req.setAttribute("message", "Registration Successful..");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
			} else {
				req.setAttribute("message", "Something Went Wrong...");
				req.getRequestDispatcher("register.jsp").forward(req, resp);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

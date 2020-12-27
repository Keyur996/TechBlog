/**
 * 
 */
package com.tech.blog.func;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tech.blog.dao.UsersDao;
import com.tech.blog.helper.Database;
import com.tech.blog.vo.Users;

/**
 * @author keyur
 *
 */
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	private Connection conn = Database.connect();
	private UsersDao user = new UsersDao(conn);
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			conn.setAutoCommit(false);
			String email = req.getParameter("user_email");
			String pass =req.getParameter("user_pass");
			Users userData = user.login(email, pass);
			if(userData != null) {
				HttpSession session = req.getSession();
				session.setAttribute("currentUser", userData);
				req.setAttribute("message", "Login Successful..");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
				conn.commit();
			} else {
				req.setAttribute("message", "Something Went Wrong..");
			}
		}catch(Exception e) {
			try {
				conn.rollback();
				conn.close();
				conn = null;
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}

package com.tech.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tech.blog.vo.Users;

public class UsersDao {
	private Connection conn;

	public UsersDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public int create(Users user) {
		int result = 0;
		try {
			StringBuffer query = new StringBuffer();
			// Make query
			query.append("insert into users(user_name, user_pass, user_email, user_gender, user_about)"
					+ " values (?, ?, ?, ?, ?)");
			
			PreparedStatement pstmt = this.conn.prepareStatement(query.toString());
			pstmt.setString(1, user.getUser_name());
			pstmt.setString(2, user.getUser_pass());
			pstmt.setString(3, user.getUser_email());
			pstmt.setString(4, user.getUser_gender());
			pstmt.setString(5, user.getUser_about());
			
			result=pstmt.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}

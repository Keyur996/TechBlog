package com.tech.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tech.blog.vo.Users;

public class UsersDao {
	private Connection conn;
	private Users user = new Users();

	public UsersDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public int create(Users user) {
		this.user = user;
		int result = 0;
		try {
			StringBuffer query = new StringBuffer();
			// Make query
			query.append("insert into users(user_name, user_pass, user_email, user_gender, user_about)"
					+ " values (?, ?, ?, ?, ?)");
			
			PreparedStatement pstmt = this.conn.prepareStatement(query.toString());
			pstmt.setString(1, this.user.getUser_name());
			pstmt.setString(2, this.user.getUser_pass());
			pstmt.setString(3, this.user.getUser_email());
			pstmt.setString(4, this.user.getUser_gender());
			pstmt.setString(5, this.user.getUser_about());
			
			result=pstmt.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	//get user using email and PassWord
	public Users login(String email, String pass) {
		try {

			//SQL query
			StringBuffer query = new StringBuffer();
			query.append("select * from users where user_email = ? and user_pass = ?");
			//Prepared Statement
			PreparedStatement pstmt = conn.prepareStatement(query.toString());
			pstmt.setString(1, email);
			pstmt.setString(2, pass);
			
			ResultSet rs = pstmt.executeQuery();
//			user.setUser_id(rs.getString("user_id"));
			if(rs.next()) {
				user.setUser_id(rs.getInt("user_id"));
				user.setUser_name(rs.getString("user_name"));
				user.setUser_email(rs.getString("user_email"));
				user.setUser_pass(rs.getString("user_pass"));
				user.setUser_about(rs.getString("user_about"));
				user.setUser_gender(rs.getString("user_gender"));
	//			user.setCreated(rs.getString("created"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}

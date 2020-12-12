package com.tech.blog.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/techblog";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "12705638";
	
	// Return type
	private static Connection conn;
	
	public static Connection connect() {
		try {
			if(conn == null) {
				// Load Driver
				Class.forName(DRIVER_NAME);
				// Create Connection
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			}		
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}

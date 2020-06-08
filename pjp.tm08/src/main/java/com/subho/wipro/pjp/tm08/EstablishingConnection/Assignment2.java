package com.subho.wipro.pjp.tm08.EstablishingConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Assignment2 {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
			
		try {			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

			System.out.println("Connection Established successfully");
		} catch (Exception e) {
			System.out.println("Connection could  not be established");
			e.printStackTrace();
		} finally {
			if (conn != null) conn.close();
		}
	}
}

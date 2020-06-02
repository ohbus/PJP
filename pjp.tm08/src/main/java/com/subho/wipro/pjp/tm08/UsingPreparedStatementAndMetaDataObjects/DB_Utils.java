package com.subho.wipro.pjp.tm08.UsingPreparedStatementAndMetaDataObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Utils {
	private static Connection conn;
	public static Connection getConnection() {
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void closeConnection() {
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	
}

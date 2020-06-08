package com.subho.wipro.pjp.tm08.ExecutingQueryAndProcessingResults;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment2 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs;
		
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");			
		} catch (Exception e) {
			System.out.println("Connection could  not be established");
			e.printStackTrace();
			if (conn != null) conn.close();
		}
		
		String sql = "SELECT first_name,job_id,salary,commission_pct FROM employees WHERE salary>1000 AND salary<2000";
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		System.out.printf("%-10S%-10S%10S%10S\n", "ename", "job", "sal", "comm");
		while (rs.next()) {
			System.out.printf("%-10S%-10S%10S%10S\n",  rs.getString("first_name"),rs.getString("job_id"),rs.getInt("salary"),rs.getInt("commission_pct"));
		}
		
		if (stmt != null) stmt.close();		
		if (conn != null) conn.close();
	}
}

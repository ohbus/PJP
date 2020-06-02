package com.subho.wipro.pjp.tm08.UsingPreparedStatementAndMetaDataObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Assignment4 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno = Integer.parseInt(args[0]);
		double fees = Double.parseDouble(args[1]);
		
		try {			
			sql = "UPDATE stdnt SET fees = ? WHERE rollno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, fees);
			pstmt.setInt(2, rollno);
			
			if (pstmt.executeUpdate() == 1)
				System.out.println("Fees of student having rollno = " + rollno + " updated successfully");
			else
				System.out.println("Error");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(!pstmt.isClosed()) pstmt.close();
			if(!conn.isClosed()) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

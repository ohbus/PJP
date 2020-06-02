package com.subho.wipro.pjp.tm08.UsingCallableStatementAndTransactions;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Assignment1 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		CallableStatement cstmt = null;		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "scott", "tiger");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
		String sql = "SELECT * FROM emp";
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				double netSalary = 0;
				
				String sql2 = "{ call calculate_salary(?, ?) }";

				cstmt = conn.prepareCall(sql2);
				cstmt.setInt(1, empno);
				cstmt.registerOutParameter(2, Types.DOUBLE);
				cstmt.executeQuery();
				
				netSalary = cstmt.getDouble(2);
				
				System.out.println("empno: " + empno + ", ename: " + ename + ", net salary: " + netSalary);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error");
			
		}
		try {
			if(!stmt.isClosed()) stmt.close();
			if(!cstmt.isClosed()) cstmt.close();
			if(!conn.isClosed()) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

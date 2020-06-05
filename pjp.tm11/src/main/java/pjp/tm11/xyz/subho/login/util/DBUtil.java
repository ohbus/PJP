package pjp.tm11.xyz.subho.login.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	@SuppressWarnings("finally")
	public static Connection getConnection()	{
		Connection con = null ;
		try	{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://demo.subho.xyz:3315/subho", "subho", "subho");
		}
		catch(Exception e)	{
			System.out.println("Connection cannot be established!");
			e.printStackTrace();
		}
		finally	{
			System.out.println("Connection Established!");
			return con;
		}
	}
}

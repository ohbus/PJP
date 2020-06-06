package pjp.tm11.xyz.subho.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pjp.tm11.xyz.subho.login.util.DBUtil;
import pjp.tm11.xyz.subho.login.bean.UserBean;

public class UserLoginDAO {
	
	@SuppressWarnings("finally")
	public boolean isPresent(UserBean ub) throws SQLException	{
		String query = "SELECT * FROM user WHERE username=? AND password=?";
		boolean present = false;
		Connection con = null;
		try	{
			con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, ub.getUname());
			ps.setString(2, ub.getPasswd());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
				present = true;
		}
		catch(Exception e)	{
			System.out.println("Cannot FIND User");
			e.printStackTrace();
		}
		finally	{
			con.close();
			return present;
		}
	}	
}

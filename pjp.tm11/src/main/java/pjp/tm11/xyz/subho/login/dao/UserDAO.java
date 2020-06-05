package pjp.tm11.xyz.subho.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import pjp.tm11.xyz.subho.login.util.DBUtil;
import pjp.tm11.xyz.subho.login.bean.UserBean;

public class UserDAO {
	
	@SuppressWarnings("finally")
	public boolean isPresent(UserBean ub)	{
		String query = "SELECT * FROM user WHERE username=? AND password=?";
		boolean present = false;
		try	{
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, ub.getUname());
			ps.setString(2, ub.getPasswd());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
				present = true;
		}
		catch(Exception e)	{
			e.printStackTrace();
		}
		finally	{
			return present;
		}
	}	
}

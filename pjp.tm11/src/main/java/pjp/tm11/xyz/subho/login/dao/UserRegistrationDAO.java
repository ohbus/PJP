package pjp.tm11.xyz.subho.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import pjp.tm11.xyz.subho.login.bean.UserBean;
import pjp.tm11.xyz.subho.login.util.DBUtil;

public class UserRegistrationDAO {
	
	@SuppressWarnings("finally")
	public boolean newUser(UserBean ub) {
		boolean status = false;
		Connection con = null;
		String query = "INSERT INTO user VALUES(?,?)";
		try {
			con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, ub.getUname());
			ps.setString(2, ub.getPasswd());
						
			ps.execute();
			status=true;
			
			System.out.println("Registered USER: "+ub.getUname());
			
		} catch (Exception e) {
			System.out.println("Cannot Register User");
			e.printStackTrace();
		}
		finally {
			return status;
		}
	}
	
	/*
	 * public static void main(String[] args) { UserBean ub = new UserBean();
	 * ub.setUname("shalini"); ub.setPasswd("shalini"); newUser(ub); }
	 */

}

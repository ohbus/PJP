package pjp.tm11.xyz.subho.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pjp.tm11.xyz.subho.login.bean.UserBean;
import pjp.tm11.xyz.subho.login.dao.UserRegistrationDAO;

/**
 * Servlet implementation class UserRegistrationServlet
 */
public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("GET method invoked");
		response.sendError(HttpServletResponse.SC_FORBIDDEN);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String uname  = request.getParameter("uname");
			String passwd = request.getParameter("passwd");
			
			UserBean ub = new UserBean();
			ub.setUname(uname);
			ub.setPasswd(passwd);
			
			UserRegistrationDAO userDao = new UserRegistrationDAO();
			
			if(userDao.newUser(ub))	{
				response.getWriter().append("<h1>Successful Registration ").append(uname).append("!</h1>");
			}
			else	{
				System.out.println("Exception occured while UserRegistrationDAO");
				response.getWriter().append("Please try again later!");
			}
		}
		catch(Exception e) {
			response.getWriter().append("Please try again later!");
			System.out.println("Exception occured in UserRegistrationServlet");
			e.printStackTrace();
		}
	}

}

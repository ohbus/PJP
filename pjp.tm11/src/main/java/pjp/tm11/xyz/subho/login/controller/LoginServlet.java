package pjp.tm11.xyz.subho.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pjp.tm11.xyz.subho.login.bean.UserBean;
import pjp.tm11.xyz.subho.login.dao.UserLoginDAO;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendError(HttpServletResponse.SC_FORBIDDEN);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String uname  = request.getParameter("uname");
			String passwd = request.getParameter("passwd");
			
			UserBean ub = new UserBean();
			ub.setUname(uname);
			ub.setPasswd(passwd);
			
			UserLoginDAO userDao = new UserLoginDAO();
			
			if(userDao.isPresent(ub))	{
				response.getWriter().append("<h1>Welcome ").append(uname).append("!</h1>");
			}
			else	{
				response.getWriter().append("Incorrect username or password");
				System.out.println("Exception occured while UserLoginDAO");
			}
		}
		catch(Exception e) {
			response.getWriter().append("Please try again later!");
			System.out.println("Exception occured in LoginServlet");
			e.printStackTrace();
		}
	}
	
}

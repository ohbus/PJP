package pjp.tm11.xyz.subho.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pjp.tm11.xyz.subho.login.bean.UserBean;
import pjp.tm11.xyz.subho.login.dao.UserDAO;

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
		response.getWriter().append("Error 403 XD");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname  = request.getParameter("uname");
		String passwd = request.getParameter("passwd");
		
		UserBean ub = new UserBean();
		ub.setUname(uname);
		ub.setPasswd(passwd);
		
		UserDAO userDao = new UserDAO();
		
		if(userDao.isPresent(ub))	{
			response.getWriter().append("<h1>Welcome</h1> <h2>").append(uname).append("</h2>");
		}
	}

}

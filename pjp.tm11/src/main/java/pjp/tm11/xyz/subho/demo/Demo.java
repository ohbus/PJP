package pjp.tm11.xyz.subho.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try	{
			response.setContentType("text/html");  
			  
			PrintWriter out = response.getWriter();  
			out.print("<html><body>");  
			out.print("<b>hello generic servlet</b>");  
			out.print("</body></html>");
		}
		catch(Exception e)	{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  
		try	{
			response.setContentType("text/html");  
			  
			PrintWriter out = response.getWriter();  
			out.print("<html><body>");  
			out.print("<b>hello generic servlet</b>");  
			out.print("</body></html>");
		}
		catch(Exception e)	{
			e.printStackTrace();
		}

	}

}

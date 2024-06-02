package demo.java.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServiceHandler
 */
public class ServiceHandler extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  { 		
		try {			
			request.setAttribute("timeStamp", new Date().getTime() );			
			getServletConfig().getServletContext().getRequestDispatcher("/hello.jsp").forward(request,response);			
		} catch (Exception e) {
			System.err.println("Fatal Servlet Error");
			e.printStackTrace();
		}			
	}
	
}
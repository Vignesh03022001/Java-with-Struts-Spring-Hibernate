package com.example.mininotes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet{
	@Override
	  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	      throws ServletException, IOException {
	    resp.setContentType("text/html;charset=UTF-8");
	    resp.getWriter().println("<!doctype html><html><body>");
	    resp.getWriter().println("<h3>Hello from Servlet</h3>");
	    resp.getWriter().println("<p>Context path: " + req.getContextPath() + "</p>");
	    resp.getWriter().println("<p><a href='" + req.getContextPath() + "/'>Home</a></p>");
	    resp.getWriter().println("</body></html>");
	  }
}

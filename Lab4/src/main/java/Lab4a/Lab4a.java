package Lab4a;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Refresh")
public class Lab4a extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setIntHeader("Refresh", 1);
		response.setContentType("text/html");
		
		double price=235.245;
		double changer=(double)Math.random()*3;
		PrintWriter out=response.getWriter();
		double change_price=price+1*changer;
		out.println  ("<html>"
				+"<body align=\"center\" bgColor=\"grey\">"
				+ "<h1>Stock Market<br>"
				+ "<h2>Stock 1 Price : "+change_price+"</h2>");
	}
}
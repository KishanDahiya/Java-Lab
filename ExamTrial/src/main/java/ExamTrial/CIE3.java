package ExamTrial;
import java.io.*;  
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;  
import java.util.*;  


@WebServlet("/CIE3")
public class CIE3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");  
		out.println("Method : "+request.getMethod());
		out.println("<br>URL : "+request.getRequestURI());
		out.println("<br>Protocol : "+request.getProtocol());
	    //PrintWriter out = response.getWriter();
		out.println("<h1 align=\"center\">HTTP headers sent by your client</h1><br><br>");  
	    Enumeration<String> Enumeration = request.getHeaderNames();
	    out.print("<table align=\"center\" border=1><tr><th>Header Name</th><th>Header Value</th>");
	    while (Enumeration.hasMoreElements()) {
	    	String headerName = (String) Enumeration.nextElement();
		    String headerValue = request.getHeader(headerName);
		    out.print("<tr><td>"+headerName+"</td><td>"+headerValue+"</td></tr>"); 
		    }
	
}}

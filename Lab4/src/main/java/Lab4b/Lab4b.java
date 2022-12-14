package Lab4b;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns="/Authentication",
		initParams= {
		@WebInitParam(name = "user", value="kishan"),
		@WebInitParam(name = "pass", value="1506")
		}
		)
public class Lab4b extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletConfig sc=getServletConfig();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		String user = sc.getInitParameter("user");
		String pass = sc.getInitParameter("pass");
		
		if(username.equalsIgnoreCase(user)&& password.equalsIgnoreCase(pass)) {
			out.println("Authentication Successfull");
		}else {
			out.println("Authentication Unsuccessfull");
		}
	}

}

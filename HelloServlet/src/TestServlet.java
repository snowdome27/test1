

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class TestServlet extends HttpServlet{

	public TestServlet(){
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws
	ServletException,IOException{
		request.setCharacterEncoding("utf-8");

		String username =request.getParameter("username");
		String password =request.getParameter("password");

		System.out.println(username);
		System.out.println(password);

		PrintWriter out = response.getWriter();

		out.println("<html><head></head><body><br>"+username+"<br>"+password+"</body></html>");
	}
}

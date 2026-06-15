import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class Add extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		res.getWriter().println(k);
	}

}

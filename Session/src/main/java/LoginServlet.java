import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		String user=req.getParameter("username");
		
		HttpSession sesion=req.getSession();
		
		session.setAttribute("user",user);
		
		res.sendRedirect("HomeServlet");
	}

}

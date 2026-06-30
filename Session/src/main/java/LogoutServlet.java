import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class LogoutServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		HttpSession session=req.getSession(false);
		
		if(session !=null) {
			session.invalidate();
		}
		res.sendRedirect("Login.jsp");
	}
}

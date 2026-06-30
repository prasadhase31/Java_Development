import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class HomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
    	
    	HttpSession session=req.getSession(false);
    	
    	res.setContentType("text/html");
    	PrintWriter out=res.getWriter();
    	
    	if(session !=null) {
    		String user=(String)session.getAttribute("user");
    	
    	if(user !=null) {
    		out.println("<h1>Welcome"+user+"</h1>");
    	}
    	
    	else {
    		out.println("Please Login");
    	}
    }
    else {
    	out.println("Session Expired");
    }
}
}
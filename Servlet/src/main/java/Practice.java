import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletConfig;

@WebServlet("/welcome")
public class Practice extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	     throws IOException,ServletException{
		
		ServletConfig config=getServletConfig();
		
		String str=config.getServlet
		res.getWriter().println("Welcome");
	}
}

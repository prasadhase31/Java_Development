import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;


@WebServlet("/welcome")
public class Practice extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	     throws IOException,ServletException{
		
		res.getWriter().println("Welcome");
	}
}

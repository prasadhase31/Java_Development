import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/welcome")
public class Practice extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		res.getWriter().println("Welcome");
	}
}

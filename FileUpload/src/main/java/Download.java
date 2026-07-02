import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/Download")
public class Download extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		String fileName="Resume.pdf";
		
		String path=getServletContext().getRealPath("")+"uploads + File.separtor + fileName";
		
		File file=new File(path);
	}

}

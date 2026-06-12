import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.*;

@WebServlet(value="/welcome",initParams= {
		@WebInitParam(name="company",value="OpenAI")
})
public class Practice extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	     throws IOException,ServletException{
		
		ServletConfig config=getServletConfig();
		
		String company=getServletConfig().getInitParameter("company");
		res.getWriter().println(company);
	}
}

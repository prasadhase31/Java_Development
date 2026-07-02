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
		
		res.setContentType("application/pdf");
		
		res.setHeader("Content-Disposition","attachment;filename="+file.getName());
		
		FileInputStream fis=new FileInputStream(file);
		
		OutputStream os=res.getOutputStream();
		
		byte[] buffer=new byte[4096];
		
		int bytesRead;
		
		while((bytesRead=fis.read(buffer)) !=-1) {
			os.write(buffer,0,bytesRead);
		}
		fis.close();
		os.close();
	}

}

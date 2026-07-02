import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/Upload")
@MultipartConfig
public class Upload extends HttpServlet {
	
	protected void doPost(HttpServletResquest req,HttpServletResponse res)throws IOException,ServletException{
		
		Part filePart=req.getPart("file");
		
		String fileName=filePart.getSubmittedFileName();
		
		String uplaodPath=getServletContext().getRealPath("")+"uploads";
		
		File folder=new File(uploadPath);
		
		if(!folder.exists()) {
			folder.mkdir();
		}
	}

} 

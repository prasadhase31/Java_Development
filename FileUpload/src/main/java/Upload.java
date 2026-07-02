import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/Upload")
@MultipartConfig
public class Upload extends HttpServlet {
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		Part filePart=req.getPart("file");
		
		String fileName=filePart.getSubmittedFileName();
		
		String uploadPath=getServletContext().getRealPath("")+"uploads";
		
		File folder=new File(uploadPath);
		
		if(!folder.exists()) {
			folder.mkdir();
		}
		filePart.write(uploadPath + File.separator +fileName);
		res.getWriter().println("File Uploaded Successfully");
	}

} 

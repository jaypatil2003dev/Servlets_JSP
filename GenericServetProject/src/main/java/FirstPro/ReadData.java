package FirstPro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/read")
public class ReadData extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String un= req.getParameter("username");
		String ue = req.getParameter("useremail");
		String up = req.getParameter("userpass");
		long phn = Long.parseLong(req.getParameter("usernumber"));
		
		
		
	
		
		PrintWriter pw1 = res.getWriter();
		pw1.print("<h1>"+un+", your data is saved successfully"+"</h1>");
		
		System.out.println("============User Data==========");
		System.out.println(un);
		System.out.println(ue);
		System.out.println(up);
		System.out.println(phn);
		
	}

}

package Read;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import entity.Details;

@WebServlet("/read")
public class ReadData extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String useremail = req.getParameter("useremail");
		String userpass = req.getParameter("userpass");
		long userphone = Long.parseLong(req.getParameter("userphone"));
		
		//Hibernate
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Details d1 = new Details();
		
		d1.setUsername(username);
		d1.setUseremail(useremail);
		d1.setUserpass(userpass);
		d1.setUserphone(userphone);
		
		et.begin();
		em.persist(d1);
		et.commit();
		
		//Details
		System.out.println("==========UserData===========");
		System.out.println(username);
		System.out.println(useremail);
		System.out.println(userpass);
		System.out.println(userphone);
		
		
		//Response
		PrintWriter pw = res.getWriter();
		
		pw.print("<h1>"+username+" ,Your account with email: "+useremail+" has been created successfully."+"</h1>");
		
	}

}

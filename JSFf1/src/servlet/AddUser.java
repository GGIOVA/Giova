package servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import entity.Dipendente;

/**
 * Servlet implementation class AddUser
 */
@WebServlet(description = "CreateUser.do", urlPatterns = { "/CreateUser.do" })
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Configuration config = new Configuration().configure();
		ServiceRegistry servReg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory factory = config.buildSessionFactory(servReg);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		Dipendente d = null;
		try {
			d = new Dipendente(request.getParameter("personalCode"), request.getParameter("nome"), request.getParameter("cognome"), request.getParameter("indirizzo"), request.getParameter("mail"), request.getParameter("telefono"), request.getParameter("mansione"), request.getParameter("livelloSeniority"), request.getParameter("sottopostoA"), dateFormat.parse(request.getParameter("dataDiNascita")), dateFormat.parse(request.getParameter("dataAssunzione")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.save(d);
		session.getTransaction().commit();
		session.close();
		
		RequestDispatcher view = request.getRequestDispatcher("useradd.jsp");
		view.forward(request, response);
	}
	
}

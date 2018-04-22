package controller;

import javax.persistence.NoResultException;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import hibernate.SessionInstance;

public class ControllerLogin {
	
	public static boolean validateUser (String email, String password) {
		
		Session localSession = SessionInstance.getSessionInstance();
		localSession.beginTransaction();
		
		boolean login = false;
		
		try {
			
			login = localSession.createQuery("from Utente u where u.email = '"+email+"' AND u.password = '"+password+"' ").getSingleResult() != null ;
			
		}catch(HibernateException e) {
			
			System.out.println("#ERR C'è stato un errore con il recupero del dipendente");
			login = false;
		}catch(NoResultException e2) {
			
			System.out.println("#ERR C'è stato un errore con il recupero del dipendente");
			login = false;
		}
		
		localSession.getTransaction().commit();
		localSession.close();
		
		return login;
	}
	
	

}

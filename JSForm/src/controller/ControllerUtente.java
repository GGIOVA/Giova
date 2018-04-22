package controller;

import org.hibernate.Session;

import entity.Utente;
import hibernate.SessionInstance;

public class ControllerUtente {
	
	public static boolean aggiungiUtente (Utente utente) {
		
		Session localSession = SessionInstance.getSessionInstance();
		localSession.beginTransaction();
		
		String email = (String) localSession.save(utente);
		
		localSession.getTransaction().commit();
		localSession.close();
		
		return email != null;
	}

}

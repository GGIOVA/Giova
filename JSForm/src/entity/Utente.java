package entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import controller.ControllerUtente;

@ManagedBean
@SessionScoped
@Entity
@Table( name = "UTENTE" )
public class Utente {
	
	@Id
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cognome")
	private String cognome;
	
	@Column(name="sesso")
	private String sesso; // MF
	
	@Column(name="data_di_nascita")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDiNascita; // yyyy-MM-yy
	
	public Utente() {}
	
	public Utente(String email, String password) {
		
		this.email = email;
		this.password = password;
	}
	
	public Utente(String email, String password, String nome, String cognome, String sesso, Date dataDiNascita) {
		
		this.email = email;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.dataDiNascita = dataDiNascita;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		
		if (sesso.equalsIgnoreCase("m")||sesso.equalsIgnoreCase("f"))
			this.sesso = sesso.toUpperCase();
		else
			System.out.println("Il sesso può essere solo M o F");
		
	}
	public Date getDataDiNascita() {
		return dataDiNascita;
	}
	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	public void setDataDiNascita(String dataDiNascita) {
		
		DateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
		
		try {
			this.dataDiNascita = dateFormat.parse(dataDiNascita);
		} catch (ParseException e) {
			
			System.out.println("La data deve essere espressa nel formato yyyy-MM-dd");
		}
	}
	
	public String registra () {
		
		if(ControllerUtente.aggiungiUtente(this))
			return "success";
		
		return "failure";
	}
	
	@Override 
	public String toString () {
		
		return "["+email+","+nome+","+cognome+"]";
	}
	

}

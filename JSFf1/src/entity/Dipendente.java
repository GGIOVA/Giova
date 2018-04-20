package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="dipendente")
public class Dipendente {
	
	@Id
	@Column(name="personal_code")
	private String personalCode;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cognome")
	private String cognome;
	
	@Column(name="indirizzo")
	private String indirizzo;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="mansione")
	private String mansione;
	
	@Column(name="livello_seniority")
	private String livelloSeniority;
	
	@Column(name="sottoposto_a")
	private String sottopostoA;
	
	@Column(name="data_nascita")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDiNascita;
	
	@Column(name="data_assunzione")
	private Date dataAssunzione;
	
	public Dipendente(String string, Date date) {
		// TODO Auto-generated constructor stub
	}
	
	public Dipendente(String personalCode, String nome, String cognome, String indirizzo, String mail, String telefono,
			String mansione, String livelloSeniority, String sottopostoA, Date dataDiNascita, Date dataAssunzione) {
		
		this.personalCode = personalCode;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.mail = mail;
		this.telefono = telefono;
		this.mansione = mansione;
		this.livelloSeniority = livelloSeniority;
		this.sottopostoA = sottopostoA;
		this.dataDiNascita = dataDiNascita;
		this.dataAssunzione = dataAssunzione;
	}
	
	public String getPersonalCode() {
		return personalCode;
	}
	public void setPersonalCode(String personalCode) {
		this.personalCode = personalCode;
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
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMansione() {
		return mansione;
	}
	public void setMansione(String mansione) {
		this.mansione = mansione;
	}
	public String getLivelloSeniority() {
		return livelloSeniority;
	}
	public void setLivelloSeniority(String livelloSeniority) {
		this.livelloSeniority = livelloSeniority;
	}
	public String getSottopostoA() {
		return sottopostoA;
	}
	public void setSottopostoA(String sottopostoA) {
		this.sottopostoA = sottopostoA;
	}
	public Date getDataDiNascita() {
		return dataDiNascita;
	}
	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	public Date getDataAssunzione() {
		return dataAssunzione;
	}
	public void setDataAssunzione(Date dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}
	
	@Override
	public String toString () {
		
		return personalCode+" "+nome+" "+cognome+" "+indirizzo+" "+mail+" "+telefono+" "+mansione+" "+livelloSeniority+""
				+" "+sottopostoA+" "+dataDiNascita+" "+mansione;
	}
	
}
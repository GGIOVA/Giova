<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>F1.com - Nuovo Utente Creato</title>
</head>
	<body>
		
		<h1>Nuovo Utente Creato</h1>
		
		<p>
			
		Personal code: <% String personalCode = request.getParameter("personalCode"); out.print(personalCode); %><br/>
		Nome: <% String nome = request.getParameter("nome"); out.print(nome); %><br/>
		Cognome: <% String cognome = request.getParameter("cognome"); out.print(cognome); %><br/>
		Indirizzo: <% String indirizzo = request.getParameter("indirizzo"); out.print(indirizzo); %><br/>
		Mail: <% String mail = request.getParameter("mail"); out.print(mail); %><br/>
		Telefono: <% String telefono = request.getParameter("telefono"); out.print(telefono); %><br/>
		Mansione: <% String mansione = request.getParameter("mansione"); out.print(mansione); %><br/>
		Livello Seniority: <% String livelloSeniority = request.getParameter("livelloSeniority"); out.print(livelloSeniority); %><br/>
		Sottoposto a: <% String sottopostoA = request.getParameter("sottopostoA"); out.print(sottopostoA); %><br/>
		Data di nascita: <% String dataDiNascita = request.getParameter("dataDiNascita"); out.print(dataDiNascita); %><br/>
		Data di assunzione: <% String dataAssunzione = request.getParameter("dataAssunzione"); out.print(dataAssunzione); %><br/>
		</p>
		
	</body>
</html>
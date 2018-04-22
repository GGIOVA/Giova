package models;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import controller.ControllerLogin;

@ManagedBean
@SessionScoped
public class Login {
	
	private String email;
	private String password;
	
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
	
	public String validateUser () {
		
		if(ControllerLogin.validateUser(email, password)) {
			System.out.println("Success");
			return "success";
		}else {
			
			System.out.println("Failure");
		}
		
		return "failure";
	}
	

}

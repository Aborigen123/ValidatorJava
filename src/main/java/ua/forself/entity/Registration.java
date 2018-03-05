package ua.forself.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import ua.online.courses.config.validation.anotation.CP;
import ua.online.courses.config.validation.anotation.UniqueRegistrationLogin1;

@Entity
@Table(name = "registration")

public class Registration extends BaseEntity {
	//@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Typed email has not correct format")

	@UniqueRegistrationLogin1(message="Model already exists")
	private String login1;
	
	
	private String password1;
	
 
	private String email1;
	

	private String confirmationPassword;
	
	
	@OneToOne(mappedBy = "registration", cascade = CascadeType.ALL)
	private Autorization autorization;
	
//	@OneToOne(mappedBy = "registration", cascade = CascadeType.ALL)
//	private Profile profile;
	
	public Registration () {}


	public String getLogin1() {
		return login1;
	}


	public void setLogin1(String login1) {
		this.login1 = login1;
	}


	public String getPassword1() {
		return password1;
	}


	public void setPassword1(String password1) {
		this.password1 = password1;
	}


	public String getEmail1() {
		return email1;
	}


	public void setEmail1(String email1) {
		this.email1 = email1;
	}


	public String getConfirmationPassword() {
		return confirmationPassword;
	}


	public void setConfirmationPassword(String confirmationPassword) {
		this.confirmationPassword = confirmationPassword;
	}


	public Autorization getAutorization() {
		return autorization;
	}


	public void setAutorization(Autorization autorization) {
		this.autorization = autorization;
	}



	
	


	
	
	
}

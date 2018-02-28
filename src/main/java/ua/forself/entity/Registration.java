package ua.forself.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import ua.online.courses.config.validation.anotation.ConfirmationPassword;

import ua.online.courses.config.validation.anotation.UniqueRegistrationLogin1;

@Entity
@Table(name = "registration")
public class Registration extends BaseEntity {

	@NotEmpty(message = "You dont write a Login")
	@NotNull(message = "You dont write a Login")
	@Size(min = 2, max = 10, message = "Should be beetween 2 and 10")
	@UniqueRegistrationLogin1(message="Model already exists")
	private String login1;
	
	@NotEmpty(message = "You dont write a Password")
	@NotNull(message = "You dont write a Password")
	@Size(min = 2, max = 20, message = "Should be beetween 2 and 10")
//	@ConfirmationPassword(message="One of confirm password write dont correct")
	private String password1;
	
@NotEmpty(message = "You dont write a Email")
@NotNull(message = "You dont write a Email")
	//@Email(message = "You make a mistake when you write  a Email")
	private String email1;
	
	@NotEmpty(message = "You dont write a PasswordSecond")
	@NotNull(message = "You dont write a PasswordSecond")
	@Size(min = 2, max = 20, message = "Should be beetween 2 and 10")
//	@ConfirmationPassword(message="One of confirm password write dont correct")
	private String confirmationPassword;
	
	@OneToOne(mappedBy = "registration", cascade = CascadeType.ALL)
	private Autorization autorization;
	
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
	
	
	


	
	
	
}

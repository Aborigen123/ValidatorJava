package ua.forself.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ua.online.courses.config.validation.anotation.CorrectAutorization;
import ua.online.courses.config.validation.anotation.CorrectAutorization1;

@Entity
@Table(name="autorization")
public class Autorization extends BaseEntity {
	
	@CorrectAutorization(message="login or password write dont correct")
	private String login1;
	
	
	@CorrectAutorization1(message="login or password write dont correct")
	private String password1;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "registration_id", nullable = true)
	private Registration registration;
	
	
	public Autorization() {
		
	}

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

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	@Override
	public String toString() {
		return "Autorization [login1=" + login1 + ", password1=" + password1 + ", registration=" + registration
				+ ", getId()=" + getId() + "]";
	}

}

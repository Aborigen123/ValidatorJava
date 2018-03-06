package ua.forself.mapper;

import ua.forself.domain.RegistrationRequest;
import ua.forself.entity.Registration;

public interface RegistrationMapper {

	public static Registration toRegistration(RegistrationRequest request) {
		Registration registration = new Registration();
		registration.setPassword1(request.getPassword1());
		registration.setConfirmationPassword(request.getConfirmationPassword());
		
		return registration;
	}
	
}

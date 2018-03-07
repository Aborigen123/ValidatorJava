package ua.forself.mapper;

import ua.forself.domain.RegistrationRequest;
import ua.forself.entity.Registration;

public interface RegistrationMapper {

	public static Registration toRegistration(RegistrationRequest request) {
		Registration registration = new Registration();
		registration.setLogin1(request.getLogin1());
		registration.setPassword1(request.getPassword1());
		registration.setEmail1(request.getEmail1());
		registration.setConfirmationPassword(request.getConfirmationPassword());
		
		return registration;
	}
	
}

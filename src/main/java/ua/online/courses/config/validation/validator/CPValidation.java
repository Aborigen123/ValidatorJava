package ua.online.courses.config.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import ua.forself.domain.RegistrationRequest;
import ua.forself.entity.Registration;
import ua.online.courses.config.validation.anotation.CP;



@Component
public class CPValidation  implements ConstraintValidator<CP, RegistrationRequest> {

	@Override
	public void initialize(CP arg0) {
	
		
	}

	@Override
	public boolean isValid(RegistrationRequest registration, ConstraintValidatorContext arg1) {
		
		
		if(registration.getPassword1() == null || registration.getConfirmationPassword() == null) {
			return false;
		}
		
		if(registration.getPassword1().equals(registration.getConfirmationPassword())) {
			return true;
		}
		return false;
	}
}

package ua.online.courses.config.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.forself.entity.Registration;
import ua.forself.service.RegService;
import ua.online.courses.config.validation.anotation.ConfirmationPassword;


@Component
public class ConfirmationPasswordValidation  implements ConstraintValidator<ConfirmationPassword, String> {
	@Autowired
	private RegService regService;

	@Override
	public void initialize(ConfirmationPassword arg0) {
	
		
	}

	

//	@Override
//	public boolean isValid(Registration registration, ConstraintValidatorContext arg1) {
//	    if(registration.getPassword1().equals(registration.getConfirmationPassword())) {
//	        return true;
//	        }
//	        else return false;
//	    }



	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		
		Registration registration = new Registration();
		   if(registration.getPassword1().equals(registration.getConfirmationPassword())) {
		        return true;
		        }
		        else return false;
		    }

	}


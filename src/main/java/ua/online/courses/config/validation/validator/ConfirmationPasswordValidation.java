package ua.online.courses.config.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.forself.service.RegService;
import ua.online.courses.config.validation.anotation.ConfirmationPassword;


@Component
public class ConfirmationPasswordValidation  implements ConstraintValidator<ConfirmationPassword, String> {
	@Autowired
	private RegService regService;

	@Override
	public void initialize(ConfirmationPassword arg0) {
	
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext arg1) {
		if(value == null) {return false;}
		if(regService.findConfirmationPassword(value) != null) {
			return false;
			}else {
		
			
			return true;
			}

}

	}


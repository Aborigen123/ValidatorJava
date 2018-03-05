package ua.online.courses.config.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.forself.service.RegService;
import ua.online.courses.config.validation.anotation.UniqueRegistrationLogin1;


@Component//щоб був окремим
public class UniqueRegistrationLogin1Validator implements ConstraintValidator<UniqueRegistrationLogin1, String> {

	@Autowired
	private RegService regService;
	
	@Override
	public void initialize(UniqueRegistrationLogin1 arg0) {
		
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext arg1) {
		if(value == null) {return false;}
		
		if (regService.findRegistraionByLogin1(value) != null) {//car != car or carService.findCarByModel(value).equals carService.findCarByModel(value)
			return false;
		}else {
	
		
		return true;
		}
	}

}

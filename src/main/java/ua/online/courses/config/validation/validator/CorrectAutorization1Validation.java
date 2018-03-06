package ua.online.courses.config.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.forself.service.AutoService;

import ua.online.courses.config.validation.anotation.CorrectAutorization1;


@Component
public class CorrectAutorization1Validation implements ConstraintValidator<CorrectAutorization1, String>{
	@Autowired
	private AutoService autoService;
	
	@Override
	public void initialize(CorrectAutorization1 arg0) {
	
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext arg1) {
		if(value == null) {return false;}
		if(autoService.findCorrectAutorization1(value) != null) {
			return true;
			}else {
		
			
			return false;
			}}

	}
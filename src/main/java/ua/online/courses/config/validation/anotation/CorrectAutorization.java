package ua.online.courses.config.validation.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


import ua.online.courses.config.validation.validator.CorrectAutorizationValidation;

@Target(value = {ElementType.FIELD, ElementType.METHOD})
@Retention(value= RetentionPolicy.RUNTIME)
@Constraint(validatedBy=CorrectAutorizationValidation.class)
public @interface CorrectAutorization {

	String message() default "login or password write dont correct";
	
	Class<?>[] groups() default{};
	
	Class<? extends Payload>[] payload() default {};
}

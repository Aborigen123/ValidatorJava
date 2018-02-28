package ua.online.courses.config.validation.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import ua.online.courses.config.validation.validator.ConfirmationPasswordValidation;


@Target(value = {ElementType.FIELD, ElementType.METHOD})
@Retention(value= RetentionPolicy.RUNTIME)
@Constraint(validatedBy=ConfirmationPasswordValidation.class)

public @interface ConfirmationPassword {

	String message() default "One of confirm password write dont correct";
	
	Class<?>[] groups() default{};
	
	Class<? extends Payload>[] payload() default {};
}

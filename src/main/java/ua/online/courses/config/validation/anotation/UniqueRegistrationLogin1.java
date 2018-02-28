package ua.online.courses.config.validation.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import ua.online.courses.config.validation.validator.UniqueRegistrationLogin1Validator;

@Target(value = {ElementType.FIELD, ElementType.METHOD})
@Retention(value= RetentionPolicy.RUNTIME)
@Constraint(validatedBy=UniqueRegistrationLogin1Validator.class)

public @interface UniqueRegistrationLogin1 {

	String message() default "Model already exists";
	
	Class<?>[] groups() default{};
	
	Class<? extends Payload>[] payload() default {};
}

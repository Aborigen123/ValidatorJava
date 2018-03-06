package ua.forself.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import ua.forself.entity.Registration;

@Component
public class RegistrationFormatter implements Formatter<Registration> {

	@Override
	public String print(Registration object, Locale arg1) {
		System.out.println(object);
		return String.valueOf(object.getId());
	}

	@Override
	public Registration parse(String text, Locale arg1) throws ParseException {
		Registration registration = new Registration();
		registration.setId(Integer.valueOf(text));
		return registration;
	}

}

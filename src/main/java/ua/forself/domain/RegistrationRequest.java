package ua.forself.domain;



import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.online.courses.config.validation.anotation.CP;

@NoArgsConstructor
@Getter @Setter
@CP
public class RegistrationRequest {


	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Typed email has not correct format")
	@NotEmpty private String password1;
	@NotEmpty private String confirmationPassword;

}

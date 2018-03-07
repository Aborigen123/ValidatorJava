package ua.forself.domain;



import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.online.courses.config.validation.anotation.CP;
import ua.online.courses.config.validation.anotation.UniqueRegistrationLogin1;

@NoArgsConstructor
@Getter @Setter
@CP
public class RegistrationRequest {

	@UniqueRegistrationLogin1(message="Model already exists")
	@NotEmpty	public String login1;
	@NotEmpty 	private String email1;
		@NotEmpty private String password1;
	@NotEmpty private String confirmationPassword;

}

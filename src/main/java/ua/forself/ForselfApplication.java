package ua.forself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ForselfApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ForselfApplication.class, args);
		
		
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return builder.sources(ForselfApplication.class) ;
	}
}

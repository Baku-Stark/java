package com.simple_project.HelloWorld;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title="My First App in Swagger",
		version = "2.0.2",
		description = "Hello World Project",
		termsOfService = "runcode",
		contact = @Contact(
				name = "Baku-Stark",
				email = "https://github.com/Baku-Stark"
		),
		license = @License(
				name = "license",
				url = "runcodenow"
		)
))
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}

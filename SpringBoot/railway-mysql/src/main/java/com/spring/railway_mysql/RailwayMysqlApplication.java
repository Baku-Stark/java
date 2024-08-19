package com.spring.railway_mysql;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title="MySQL and Railway",
		version = "0.1.0",
		description = "MySQL Railway Project",
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
public class RailwayMysqlApplication {
	public static void main(String[] args) {
		SpringApplication.run(RailwayMysqlApplication.class, args);
	}
}

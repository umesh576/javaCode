package com.services.serviceproject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


// @SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ServiceprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceprojectApplication.class, args);
	}

}

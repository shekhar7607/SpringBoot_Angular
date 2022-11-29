package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.demo.repository.RegistrationRepository;

@SpringBootApplication
public class RegistrationApplication {

	
	public static void main(String[] args) {
		
		
		//RegistrationRepository registrationRepository;
		
		System.out.println("version: " + SpringVersion.getVersion());
		SpringApplication.run(RegistrationApplication.class, args);
	}
	
	 
}

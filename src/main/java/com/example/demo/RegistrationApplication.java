package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.RegistrationRepository;

@SpringBootApplication
public class RegistrationApplication {

	
	public static void main(String[] args) {
		
		
		RegistrationRepository registrationRepository;
		
		
		SpringApplication.run(RegistrationApplication.class, args);
	}
	
	 
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;

@RestController
public class RegistrationController {
	
	
	@GetMapping("/users")
	public Users getUsers() {
		Users u = new Users(1,"shekhar7607@gmail.com","shekhar7607","!Aworker2#");
		return u;
		
	}

}

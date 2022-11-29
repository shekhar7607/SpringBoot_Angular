package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.service.UserService;

@RestController
public class RegistrationController {
	
	@Autowired
	UserService userservice;
	
	
	//creating post mapping that post the student detail in the database  
	@PostMapping("/user")  
	private void saveUser(@RequestBody Users user)   
	{  
		userservice.saveOrUpdate(user);  
	//return user.getId();  
	} 
	
	
	

		
	

}

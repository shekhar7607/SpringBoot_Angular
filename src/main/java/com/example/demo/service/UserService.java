package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Users;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userrepository;

	public void saveOrUpdate(Users user)   
	{  
		userrepository.save(user);  
	}  
	
	
	

}

package com.example.demo.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Users;
import com.example.demo.repository.RegistrationRepository;

@Service
public class RegistartionService {
	
	@Autowired
	private RegistrationRepository registrationRepository;

	public RegistartionService(RegistrationRepository registrationrepository) {
		
	
		super();
		this.registrationRepository = registrationrepository;
	}

	@PostConstruct
	public void loadData()
	{
		Users user = new Users();
		user.setEmailId("shekhar7607@gmail.com");
		user.setUserName("shekhar7607");
		user.setPassword("rf4rf@");
		registrationRepository.save(user);
		
	}
	
	
	

}

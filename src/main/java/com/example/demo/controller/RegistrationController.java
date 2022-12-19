package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.repository.UserRepository;


/**
 * @author swami.shekhar
 *
 */
@RestController
public class RegistrationController {
	
	@Autowired
	UserRepository userrepository;
	
	
	//creating post mapping that post the student detail in the database  
	@PostMapping("/user")  
	private void saveUser(@RequestBody Users user)   
	{  
		userrepository.save(user);  
	} 
	
	@GetMapping("/getAllUsers")
	public List<Users> getAll(){
		return userrepository.findAll();
	}
	
	@GetMapping("getUser/{profession}")
	public List<Users> getUserbyProfession(@PathVariable String profession)
	{
		return userrepository.findByProfession(profession);
		
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id) {
		userrepository.deleteById(id);
	}

		
	


}

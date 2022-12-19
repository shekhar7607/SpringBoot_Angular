package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	
    @Id
    @Column
    @GeneratedValue
	private int id;
    @Column
	private String emailId;
    @Column
	private String userName;
    @Column
    private String profession;
    @Column
	private String password;
	
	public Users() {
	
	}
	
	public Users(int id, String emailId, String userName,String profession, String password) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
		this.profession = profession;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getProfession() {
		return profession;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}

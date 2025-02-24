package com.entity;

public class User {
	private int id;
	private String Username;
	private String Telephone;
	private String email;
	private String pass_word;
	
	
	
	
	public User() {
		super();
		
	}
	public User(String username, String telephone, String email, String pass_word) {
		super();
		Username = username;
		Telephone = telephone;
		this.email = email;
		this.pass_word = pass_word;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass_word() {
		return pass_word;
	}
	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}
	
	

}

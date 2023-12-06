package com.mentormate.mentormate.models;

public class UsersModel {
	private long id;
    private String email;
    private String name;
    private String password;
    private String role;
    private String designation;
	public UsersModel() {
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setUserId(long userId) {
		this.id = userId;
	}

	public UsersModel( String email, String name, String password, String role, String designation) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.role = role;
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}

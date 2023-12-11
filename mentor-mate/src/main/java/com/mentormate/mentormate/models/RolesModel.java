package com.mentormate.mentormate.models;

import com.mentormate.mentormate.entities.Roles;
import com.mentormate.mentormate.entities.Users;


public class RolesModel {
	
	private long id;
	private Users user;
	private String role;
	public RolesModel() {
	}
	public RolesModel(Roles role) {
		this.user = role.getUser();
		this.role = role.getRole();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}

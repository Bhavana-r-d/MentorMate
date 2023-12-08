package com.mentormate.mentormate.models;

import com.mentormate.mentormate.entities.Roles;
import com.mentormate.mentormate.entities.Users;


public class RolesModel {
	
	private long id;
	private Users userId;
	private String role;
	public RolesModel() {
	}
	public RolesModel(Roles role) {
		this.userId = role.getUserId();
		this.role = role.getRole();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Users getUserId() {
		return userId;
	}
	public void setUserId(Users userId) {
		this.userId = userId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}

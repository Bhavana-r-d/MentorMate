package com.mentormate.mentormate.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String email;

	@Column(name = "Name")
	private String name;
	private String password;
	private Set<String> roles;
	private String confirmpassword;
	private String designation;

	public Users() {
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getId() {
		return id;
	}

	public void setUserId(long userId) {
		this.id = userId;
	}

	public Users(String email, String name, String password, String confirmpassword, Set<String> roles) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.roles = roles;
		this.confirmpassword = confirmpassword;
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

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", email=" + email + ", name=" + name + ", password=" + password + ", roles=" + roles
				+ ", designation=" + designation + "]";
	}

}
package com.mentormate.mentormate.service;

import java.util.List;

import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.model.User;

public interface UserService {

	List<Users> getAllUsers();
//	Users registerUser(Users user);
	Users createUser(Users user);
//	Users registerUser(User user);
	Users registerUser(Users user);

	//Users save(User user);
//	Users registerUser(User user);
//	Users registerUser(User user);
//	Users registerUser(Users user);

}
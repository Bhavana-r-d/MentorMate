package com.mentormate.mentormate.service;

import java.util.List;

import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.model.LoginModel;

public interface UserService {

	//	public Users createUser(User user) {
	//
	//		Users userdetails = new Users(user.getEmail(), user.getName(), user.getPassword(), user.getRoles(),
	//				user.getConfirmPassword());
	//		return userRepo.save(userdetails);
	//
	//	}
	////
	List<Users> getAllUsers();

	//	@Override
	//	public User save(Users user) {
	//	    // Additional logic if needed (e.g., validation)
	//
	//	    // Encode the password before saving it to the database
	//	   // user.setPassword(passwordEncoder.encode(user.getPassword()));
	//
	//	    // Save the user to the database
	//	    return userRepo.save(user);
	//	}
	Users registerUser(Users user);

	Users createUser(Users user);
	 Users loginUser(LoginModel loginModel);
	 
	 List<Users> getAllRegisteredUsers();

}
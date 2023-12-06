package com.mentormate.mentormate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mentormate.mentormate.repositories.UsersRepo;

import jakarta.annotation.PostConstruct;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UsersServiceImpl {
	@Autowired
	UsersRepo userRepo;
	
	@PostConstruct
	public void populateUsers() {
		RegisterUserModel model = new RegisterUserModel();
		model.setUsername("scott");
		model.setPassword("tiger123");
		createUser(model);
		model.setUsername("admin");
		model.setPassword("admin123");
		User user = createUser(model);
	}

}

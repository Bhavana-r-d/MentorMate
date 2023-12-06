package com.mentormate.mentormate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.repositories.UsersRepo;

import jakarta.annotation.PostConstruct;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersRepo usersRepo;
	
	@PostConstruct
	public void populateTable() {
		//email,firstName,lastName,password,role,designation
		usersRepo.save(new Users("john.doe@example.com", "John", "Doe", "tech lead"));
		usersRepo.save(new Users("jane.smith@example.com", "Jane", "Smith","associate software developer"));
		usersRepo.save(new Users("bob.lee@example.com", "Bob", "Lee", "senior software developer"));
		usersRepo.save(new Users("alice.wang@example.com", "Alice", "Wang", "UI/UX designer"));
		usersRepo.save(new Users("tom.clark@example.com", "Tom", "Clark", "asdfgh", "business analyst"));
	}
	@Override
	public Users createUsers(Users user){
		return null;
	}
	
	@Override
	public Users updateUsers(Users user){
		return null;
	}
	
	@Override
	public Users getUserById(long userId){
		return usersRepo.getReferenceById(userId);
	}
	
	@Override
	public List<Users> getAll(){
		return null;
	}
}


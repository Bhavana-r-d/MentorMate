package com.mentormate.mentormate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mentormate.mentormate.entities.MentorMenteeRelationship;
import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.repositories.MentorMenteeRelationshipRepo;
import com.mentormate.mentormate.repositories.UsersRepo;

import jakarta.annotation.PostConstruct;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersRepo usersRepo;
	
	@Autowired
	private MentorMenteeRelationshipRepo mentorMenteeRelationshipRepo;
	
	@PostConstruct
	public void populateTable() {
		//inserting some sample users
		Users user1 = new Users("john.doe@example.com", "John", "Doe", "tech lead");
		Users user2 = new Users("jane.smith@example.com", "Jane", "Smith","associate software developer");
		Users user3 = new Users("bob.lee@example.com", "Bob", "Lee", "senior software developer");
		Users user4 = new Users("alice.wang@example.com", "Alice", "Wang", "UI/UX designer");
		Users user5 = new Users("tom.clark@example.com", "Tom", "Clark","business analyst");
		usersRepo.save(user1);
		usersRepo.save(user2);
		usersRepo.save(user3);
		usersRepo.save(user4);
		usersRepo.save(user5);
		
		//inserting mentor-mentee mapping for sample users
		mentorMenteeRelationshipRepo.save(new MentorMenteeRelationship(user1, user3));
		mentorMenteeRelationshipRepo.save(new MentorMenteeRelationship(user1, user4));
		mentorMenteeRelationshipRepo.save(new MentorMenteeRelationship(user2, user5));

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
	public List<Users> getAllUsers(){
		return usersRepo.findAll();
	}
	
	//Add a mentor-mentee relationship
	@Override
	public MentorMenteeRelationship createMentorMenteeRelationship(MentorMenteeRelationship mentorMenteeRelationship){
		return null;
	}
	
	//Modify/update a mentor-mentee relationship
	@Override
	public MentorMenteeRelationship updateMentorMenteeRelationship(MentorMenteeRelationship mentorMenteeRelationship){
		return null;
	}
	
	@Override
	public Users getMentorForMentee(Users mentee){
		long id = mentee.getId();
//		mentorMenteeRelationshipRepo.
		return mentee;
	}
	
	@Override
	public List<Users> getMenteesForMentor(Users mentee){
		return null;
		
//		return usersRepo.getReferenceById(userId);
	}
	@Override
	public List<MentorMenteeRelationship> getAllMentorMenteeRelationships(){
		return mentorMenteeRelationshipRepo.findAll();
	}
}


package com.mentormate.mentormate.services;

import java.util.ArrayList;
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
		usersRepo.save(new Users("john.doe@example.com", "John", "Doe", "tech lead")); // Mentor 1
		usersRepo.save(new Users("jane.smith@example.com", "Jane", "Smith", "associate software developer")); // Mentor 2
		usersRepo.save(new Users("bob.lee@example.com", "Bob", "Lee", "senior software developer")); // Mentee 1 for 1
		usersRepo.save(new Users("alice.wang@example.com", "Alice", "Wang", "UI/UX designer")); // Mentee 2 for 1
		usersRepo.save(new Users("tom.clark@example.com", "Tom", "Clark", "asdfgh", "business analyst"));// Mentee 3 for 2
	}

	@Override
	public Users createUsers(Users user) {
		return usersRepo.save(user);
	}

	@Override
	public Users updateUsers(Users user) {
		return usersRepo.save(user);
	}

	@Override
	public Users getUserById(long userId) {
		return usersRepo.getReferenceById(userId);
	}

	@Override
	public List<Users> getAllUsers() {
		return usersRepo.findAll();
	}

	@Override
	public MentorMenteeRelationship createMentorMenteeRelationship(MentorMenteeRelationship mentorMenteeRelationship) {
		return mentorMenteeRelationshipRepo.save(mentorMenteeRelationship);
	}

	@Override
	public MentorMenteeRelationship updateMentorMenteeRelationship(MentorMenteeRelationship mentorMenteeRelationship) {
		return mentorMenteeRelationshipRepo.save(mentorMenteeRelationship);
	}

	@Override
	public MentorMenteeRelationship getMentorMenteeRelationship(long id) {
		return mentorMenteeRelationshipRepo.getReferenceById(id);
	}

	@Override
	public List<MentorMenteeRelationship> getAllMentorMenteeRelationship() {
		return mentorMenteeRelationshipRepo.findAll();
	}

	// Return a mentor user object, takes mentee id. Assuming a mentee has only one
	// mentor
	@Override
	public Users getMentorForMentee(Users mentee) {
		return mentorMenteeRelationshipRepo.findByMentee(mentee).getMentor();
	}

	@Override
	public List<Users> getMenteesForMentor(Users mentor) {
		List<MentorMenteeRelationship> li = mentorMenteeRelationshipRepo.findByMentor(mentor);
		List<Users> mentees = new ArrayList<Users>();
		for (MentorMenteeRelationship l : li) {
			mentees.add(l.getMentee());
		}
		return mentees;

	}

}

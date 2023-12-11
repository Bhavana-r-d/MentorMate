package com.mentormate.mentormate.services;

import java.util.List;

import com.mentormate.mentormate.entities.MentorMenteeRelationship;
import com.mentormate.mentormate.entities.Users;

public interface UsersService {

	Users createUsers(Users user);

	Users updateUsers(Users user);

	Users getUserById(long userId);

	List<Users> getAllUsers();

	public MentorMenteeRelationship createMentorMenteeRelationship(MentorMenteeRelationship mentorMenteeRelationship);

	public MentorMenteeRelationship updateMentorMenteeRelationship(MentorMenteeRelationship mentorMenteeRelationship);

	public MentorMenteeRelationship getMentorMenteeRelationship(long id);

	public List<MentorMenteeRelationship> getAllMentorMenteeRelationship();

	public Users getMentorForMentee(Users mentee);
	
	public List<Users> getMenteesForMentor(Users mentor);
}
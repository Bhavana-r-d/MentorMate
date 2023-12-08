package com.mentormate.mentormate.services;

import java.util.List;

import com.mentormate.mentormate.entities.MentorMenteeRelationship;
import com.mentormate.mentormate.entities.Users;

public interface UsersService {

	Users createUsers(Users user);

	Users updateUsers(Users user);

	Users getUserById(long userId);

	List<Users> getAllUsers();

	//Add a mentor-mentee relationship
	MentorMenteeRelationship createMentorMenteeRelationship(MentorMenteeRelationship mentorMenteeRelationship);

	//Modify/update a mentor-mentee relationship
	MentorMenteeRelationship updateMentorMenteeRelationship(MentorMenteeRelationship mentorMenteeRelationship);

	Users getMentorForMentee(Users mentee);

	List<Users> getMenteesForMentor(Users mentee);

	List<MentorMenteeRelationship> getAllMentorMenteeRelationships();

}
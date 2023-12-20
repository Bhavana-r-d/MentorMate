package com.mentormate.mentormate.services;

import java.util.List;

import com.mentormate.mentormate.entities.MentorMenteeRelationship;
import com.mentormate.mentormate.entities.Users;

public interface MentorMenteeRelationshipService {

	// Adds a new mentee-mentor mapping and returns it
	MentorMenteeRelationship createMentorMenteeRelationship(MentorMenteeRelationship mentorMenteeRelationship);

	// Updates mentee-mentor mapping and returns it
	MentorMenteeRelationship updateMentorMenteeRelationship(MentorMenteeRelationship mentorMenteeRelationship);

	// Returns one mentee-mentor mapping based on id
	MentorMenteeRelationship getMentorMenteeRelationship(long id);

	// Returns list of all mentee-mentor mapping records
	List<MentorMenteeRelationship> getAllMentorMenteeRelationship();

	// Returns a mentor (user object) based on mentee's user Id. Assuming a mentee
	// has only one mentor
	Users getMentorForMentee(Users mentee);

	// Returns a list of all mentees under a single mentor based on mentor's user Id
	List<Users> getMenteesForMentor(Users mentor);

}
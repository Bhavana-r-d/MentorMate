package com.mentormate.mentormate.services;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mentormate.mentormate.entities.MentorMenteeRelationship;
import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.repositories.MentorMenteeRelationshipRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class MentorMenteeRelationshipServiceImpl implements MentorMenteeRelationshipService {

	@Autowired
	private MentorMenteeRelationshipRepository mentorMenteeRelationshipRepo;

	// Adds a new mentee-mentor mapping and returns it
	@Override
	public MentorMenteeRelationship createMentorMenteeRelationship(MentorMenteeRelationship mentorMenteeRelationship) {
		return mentorMenteeRelationshipRepo.save(mentorMenteeRelationship);
	}

	// Updates mentee-mentor mapping and returns it
	@Override
	public MentorMenteeRelationship updateMentorMenteeRelationship(MentorMenteeRelationship mentorMenteeRelationship) {
		return mentorMenteeRelationshipRepo.save(mentorMenteeRelationship);
	}

	// Returns one mentee-mentor mapping based on id
	@Override
	public MentorMenteeRelationship getMentorMenteeRelationship(long id) {
		return mentorMenteeRelationshipRepo.getReferenceById(id);
	}

	// Returns list of all mentee-mentor mapping records
	@Override
	public List<MentorMenteeRelationship> getAllMentorMenteeRelationship() {
		return mentorMenteeRelationshipRepo.findAll();
	}

	// Returns a mentor (user object) based on mentee's user Id. Assuming a mentee
	// has only one mentor
	@Override
	public Users getMentorForMentee(Users mentee) {
		MentorMenteeRelationship menteemapping=  mentorMenteeRelationshipRepo.findByMentee(mentee);
		if(menteemapping!=null) {
			return menteemapping.getMentor();
		}
		return null;
	}

	// Returns a list of all mentees under a single mentor based on mentor's user Id
	@Override
	public List<Users> getMenteesForMentor(Users mentor) {
		if(mentor!=null) {
		// fetches list of records based on mentor. Using stream, getMentee() getter is
		// called for each element, returned user object is stored in List<Users>
		return mentorMenteeRelationshipRepo.findByMentor(mentor).stream().map(m -> m.getMentee())
				.collect(Collectors.toList());
		}
		return Collections.emptyList();
	}
	
	// Manually insert mentor-mentee mapping in mysql
	// eg: insert into mentor_mentee_relationship (mentee_id,mentor_id) values (1,1);
}

package com.mentormate.mentormate.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mentormate.mentormate.entities.MentorMenteeRelationship;
import com.mentormate.mentormate.entities.Users;

public interface MentorMenteeRelationshipRepo extends JpaRepository<MentorMenteeRelationship, Long> {

	MentorMenteeRelationship findByMentee(Users mentee);
	List<MentorMenteeRelationship> findByMentor(Users mentor);
}

package com.mentormate.mentormate.repositories;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mentormate.mentormate.entities.MentorMenteeRelationship;
import com.mentormate.mentormate.entities.Users;

@Repository
public interface MentorMenteeRelationshipRepository extends JpaRepository<MentorMenteeRelationship, Long> {
	// fetch record based on menteeId
		MentorMenteeRelationship findByMentee(Users mentee);

		// fetch list of records based on mentorId
		List<MentorMenteeRelationship> findByMentor(Users mentor);
}

package com.mentormate.mentormate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mentormate.mentormate.entities.MentorMenteeRelationship;

@Repository
public interface MentorMenteeRelationshipRepo extends JpaRepository<MentorMenteeRelationship, Long> {

}

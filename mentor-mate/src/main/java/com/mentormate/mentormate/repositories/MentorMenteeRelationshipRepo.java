package com.mentormate.mentormate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mentormate.mentormate.entities.MentorMenteeRelationship;

public interface MentorMenteeRelationshipRepo extends JpaRepository<MentorMenteeRelationship, Long> {

}

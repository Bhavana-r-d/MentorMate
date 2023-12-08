package com.mentormate.mentormate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mentormate.mentormate.entities.KeyResults;

@Repository
public interface KeyResultsRepo extends JpaRepository<KeyResults, Long> {

}

package com.mentormate.mentormate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mentormate.mentormate.entities.OKRs;

@Repository
public interface OKRsRepo extends JpaRepository<OKRs, Long> {

}

package com.mentormate.mentormate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mentormate.mentormate.entities.Roles;

@Repository
public interface RolesRepo extends JpaRepository<Roles, Long> {

}

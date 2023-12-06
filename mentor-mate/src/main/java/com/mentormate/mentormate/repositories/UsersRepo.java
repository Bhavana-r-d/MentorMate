package com.mentormate.mentormate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mentormate.mentormate.entities.Users;

public interface UsersRepo extends JpaRepository<Users, Long>{

}

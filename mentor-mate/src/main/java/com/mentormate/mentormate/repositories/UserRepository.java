package com.mentormate.mentormate.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.model.User;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	
	Users findByEmail(String email);
	List<Users> findAll();
//Users save(User user);
}

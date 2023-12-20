package com.mentormate.mentormate.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mentormate.mentormate.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
	// Custom query method to find a user by email
	Users findByEmail(String email);

	// Custom query method to find all users
	List<Users> findAll();
}

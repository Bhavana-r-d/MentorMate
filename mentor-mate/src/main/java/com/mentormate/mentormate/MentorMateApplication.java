package com.mentormate.mentormate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.repositories.UsersRepo;

@SpringBootApplication
public class MentorMateApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentorMateApplication.class, args);
	}
	
}

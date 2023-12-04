package com.mentormate.mentormate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Mentors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long mentorId;
	@OneToOne
	@JoinColumn(name = "user_id")
	private Users userId;
}

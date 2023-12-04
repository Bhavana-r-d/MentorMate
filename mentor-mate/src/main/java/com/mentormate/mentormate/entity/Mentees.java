package com.mentormate.mentormate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Mentees {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long menteeId;
	@OneToOne
	@JoinColumn(name = "user_id")
	private Users userId;
	@ManyToOne
	@JoinColumn(name = "mentor_id")
	private Users mentorId;

}

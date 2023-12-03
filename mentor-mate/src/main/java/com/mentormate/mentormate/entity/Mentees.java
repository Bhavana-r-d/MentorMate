package com.mentormate.mentormate.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Mentees {

	@OneToOne
	@JoinColumn(name = "mentee_id")
	private Users mentee;

}

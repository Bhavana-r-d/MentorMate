package com.mentormate.mentormate.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Mentors {
	
	@OneToOne
    @JoinColumn(name = "mentor_id")
    private Users mentor;
}

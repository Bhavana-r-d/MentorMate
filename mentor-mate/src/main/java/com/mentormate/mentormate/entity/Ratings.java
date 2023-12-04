package com.mentormate.mentormate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ratings {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ratingId;

    @ManyToOne
    @JoinColumn(name = "key_results", nullable = false)
    private KeyResults keyResults;

    @ManyToOne
    @JoinColumn(name = "mentor_id", nullable = false)
    private Mentors mentor;
    private int rating;
    private String comment;
}

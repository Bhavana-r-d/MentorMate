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
    private Long ratingId;

    @ManyToOne
    @JoinColumn(name = "okr_id", nullable = false)
    private Okrs okr;

    @ManyToOne
    @JoinColumn(name = "mentor_id", nullable = false)
    private Users mentor;
    private Integer rating;
    private String comment;
}

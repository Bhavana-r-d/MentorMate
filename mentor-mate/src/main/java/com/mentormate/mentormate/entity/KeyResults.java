package com.mentormate.mentormate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class KeyResults {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long keyResultId;
	@ManyToOne
	@JoinColumn(name = "okr_id", nullable = false)
	private Okrs okr;
	private String keyResult;
	private String progress;
}

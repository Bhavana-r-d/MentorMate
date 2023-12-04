package com.mentormate.mentormate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "okrs")
public class Okrs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long okrId;
	@ManyToOne
	@JoinColumn(name = "mentee_id")
	private Mentees menteeId;
	private String objective;
}

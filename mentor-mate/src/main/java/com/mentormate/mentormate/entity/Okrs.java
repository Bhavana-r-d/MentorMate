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
	public Okrs() {
	}
	public Okrs(long okrId, Mentees menteeId, String objective) {
		this.okrId = okrId;
		this.menteeId = menteeId;
		this.objective = objective;
	}
	public long getOkrId() {
		return okrId;
	}
	public void setOkrId(long okrId) {
		this.okrId = okrId;
	}
	public Mentees getMenteeId() {
		return menteeId;
	}
	public void setMenteeId(Mentees menteeId) {
		this.menteeId = menteeId;
	}
	public String getObjective() {
		return objective;
	}
	public void setObjective(String objective) {
		this.objective = objective;
	}
	
}

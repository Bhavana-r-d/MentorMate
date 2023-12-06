package com.mentormate.mentormate.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MentorMenteeRelationship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(targetEntity = Users.class,cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	@JoinColumn(name = "mentor_id",referencedColumnName = "id")
	private Users mentorId;
	
	@ManyToOne(targetEntity = Users.class,cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	@JoinColumn(name = "mentee_id",referencedColumnName = "id")
	private Users menteeId;

	public MentorMenteeRelationship() {
	}

	public MentorMenteeRelationship(long id, Users mentorId, Users menteeId) {
		this.id = id;
		this.mentorId = mentorId;
		this.menteeId = menteeId;
	}

	public MentorMenteeRelationship(Users mentorId, Users menteeId) {
		this.mentorId = mentorId;
		this.menteeId = menteeId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Users getMentorId() {
		return mentorId;
	}

	public void setMentorId(Users mentorId) {
		this.mentorId = mentorId;
	}

	public Users getMenteeId() {
		return menteeId;
	}

	public void setMenteeId(Users menteeId) {
		this.menteeId = menteeId;
	}
	
}
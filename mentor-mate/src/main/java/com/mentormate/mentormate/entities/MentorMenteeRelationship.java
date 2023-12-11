package com.mentormate.mentormate.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mentorMenteeRelationship")
public class MentorMenteeRelationship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(targetEntity = Users.class,cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	@JoinColumn(name = "mentor",referencedColumnName = "id")
	private Users mentor;
	
	@ManyToOne(targetEntity = Users.class,cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	@JoinColumn(name = "mentee",referencedColumnName = "id")
	private Users mentee;

	public MentorMenteeRelationship() {
	}

	public MentorMenteeRelationship(long id, Users mentor, Users mentee) {
		this.id = id;
		this.mentor = mentor;
		this.mentee = mentee;
	}

	public MentorMenteeRelationship(Users mentor, Users mentee) {
		this.mentor = mentor;
		this.mentee = mentee;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Users getMentor() {
		return mentor;
	}

	public void setMentor(Users mentor) {
		this.mentor = mentor;
	}

	public Users getMentee() {
		return mentee;
	}

	public void setMentee(Users mentee) {
		this.mentee = mentee;
	}
	
}
package com.mentormate.mentormate.models;

import com.mentormate.mentormate.entities.MentorMenteeRelationship;
import com.mentormate.mentormate.entities.Users;

public class MentorMenteeRelationshipModel {
	private long id;
	private Users mentor;
	private Users mentee;

	public MentorMenteeRelationshipModel() {
	}

	public MentorMenteeRelationshipModel(MentorMenteeRelationship mentorMeneeRelationship) {
		this.id = mentorMeneeRelationship.getId();
		this.mentor = mentorMeneeRelationship.getMentor();
		this.mentee = mentorMeneeRelationship.getMentee();
	}

	public MentorMenteeRelationshipModel(Users mentor, Users mentee) {
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
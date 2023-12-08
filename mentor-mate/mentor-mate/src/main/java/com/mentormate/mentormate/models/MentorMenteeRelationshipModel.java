package com.mentormate.mentormate.models;

import com.mentormate.mentormate.entities.MentorMenteeRelationship;
import com.mentormate.mentormate.entities.Users;

public class MentorMenteeRelationshipModel {
	private long id;
	private Users mentorId;
	private Users menteeId;

	public MentorMenteeRelationshipModel() {
	}

	public MentorMenteeRelationshipModel(MentorMenteeRelationship mentorMeneeRelationship) {
		this.id = mentorMeneeRelationship.getId();
		this.mentorId = mentorMeneeRelationship.getMentorId();
		this.menteeId = mentorMeneeRelationship.getMenteeId();
	}

	public MentorMenteeRelationshipModel(Users mentorId, Users menteeId) {
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
package com.mentormate.mentormate.models;

import com.mentormate.mentormate.entities.OKRs;
import com.mentormate.mentormate.entities.Users;

public class OKRsModel {
	private long id;
	private Users mentee;
	private String objective;
	public OKRsModel() {
	}

	public OKRsModel(OKRs okr) {
		this.id = okr.getId();
		this.mentee = okr.getMentee();
		this.objective = okr.getObjective();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Users getMentee() {
		return mentee;
	}

	public void setMentee(Users menteeId) {
		this.mentee = menteeId;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}
}

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
@Table(name = "okrs")
public class OKRs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(targetEntity = Users.class,cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	@JoinColumn(name = "menteeId",referencedColumnName = "id")
	private Users menteeId;
	private String objective;
	public OKRs() {
	}

	public OKRs(Users menteeId, String objective) {
		this.menteeId = menteeId;
		this.objective = objective;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Users getMenteeId() {
		return menteeId;
	}

	public void setMenteeId(Users menteeId) {
		this.menteeId = menteeId;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}


	
}

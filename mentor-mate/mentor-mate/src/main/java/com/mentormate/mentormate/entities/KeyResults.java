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
@Table(name = "keyResults")
public class KeyResults {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne(targetEntity = OKRs.class,cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	@JoinColumn(name = "okrId",referencedColumnName = "id")
	private OKRs okrId;
	private String keyResult;
	public KeyResults() {
		// TODO Auto-generated constructor stub
	}
	
	public KeyResults( OKRs okrId, String keyResult) {
		this.okrId = okrId;
		this.keyResult = keyResult;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public OKRs getOkrId() {
		return okrId;
	}

	public void setOkrId(OKRs okrId) {
		this.okrId = okrId;
	}

	public String getKeyResult() {
		return keyResult;
	}
	public void setKeyResult(String keyResult) {
		this.keyResult = keyResult;
	}
}

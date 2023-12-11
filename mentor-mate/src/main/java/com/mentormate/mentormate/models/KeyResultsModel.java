package com.mentormate.mentormate.models;

import com.mentormate.mentormate.entities.KeyResults;
import com.mentormate.mentormate.entities.OKRs;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class KeyResultsModel {
	private long id;
	private OKRs okr;
	private String keyResult;


	public KeyResultsModel() {
	}

	public KeyResultsModel(KeyResults keyResult) {
		this.id = keyResult.getId();
		this.okr = keyResult.getOkr();
		this.keyResult = keyResult.getKeyResult();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public OKRs getOkr() {
		return okr;
	}

	public void setOkr(OKRs okr) {
		this.okr = okr;
	}

	public String getKeyResult() {
		return keyResult;
	}
	public void setKeyResult(String keyResult) {
		this.keyResult = keyResult;
	}
}

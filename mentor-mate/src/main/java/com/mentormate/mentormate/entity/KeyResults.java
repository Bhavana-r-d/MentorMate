package com.mentormate.mentormate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class KeyResults {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long keyResultId;
	@ManyToOne
	@JoinColumn(name = "okr_id", nullable = false)
	private OKRs okr;
	private String keyResult;
	public KeyResults() {
		// TODO Auto-generated constructor stub
	}
	public KeyResults(long keyResultId, OKRs okr, String keyResult) {
		this.keyResultId = keyResultId;
		this.okr = okr;
		this.keyResult = keyResult;
	}
	public long getKeyResultId() {
		return keyResultId;
	}
	public void setKeyResultId(long keyResultId) {
		this.keyResultId = keyResultId;
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

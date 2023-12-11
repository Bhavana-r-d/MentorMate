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
	@JoinColumn(name = "okr",referencedColumnName = "id")
	private OKRs okr;
	private String keyResult;
	public KeyResults() {
		// TODO Auto-generated constructor stub
	}
	
	public KeyResults( OKRs okr, String keyResult) {
		this.okr = okr;
		this.keyResult = keyResult;
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

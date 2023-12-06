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
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(targetEntity = KeyResults.class, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "key_results_id",referencedColumnName = "id")
	private KeyResults keyResultsId;
	private String comments;
	public Comments() {
		// TODO Auto-generated constructor stub
	}
	public Comments(KeyResults keyResultsId, String comments) {
		this.keyResultsId = keyResultsId;
		this.comments = comments;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public KeyResults getKeyResultsId() {
		return keyResultsId;
	}
	public void setKeyResultsId(KeyResults keyResultsId) {
		this.keyResultsId = keyResultsId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}

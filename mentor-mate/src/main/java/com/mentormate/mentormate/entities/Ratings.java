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
public class Ratings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne(targetEntity = KeyResults.class, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "keyResultsId",referencedColumnName = "id")
	private KeyResults keyResultsId;
	private int rating;
	private String comment;

	public Ratings() {
	}

	public Ratings(KeyResults keyResultsId, int rating, String comment) {
		this.keyResultsId = keyResultsId;
		this.rating = rating;
		this.comment = comment;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}


}

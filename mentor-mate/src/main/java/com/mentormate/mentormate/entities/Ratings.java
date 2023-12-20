package com.mentormate.mentormate.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ratings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne(targetEntity = KeyResults.class, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "keyResultsId", referencedColumnName = "id")
	private KeyResults keyResults;
	private int rating;
	private String comment;

	public Ratings(KeyResults keyResults, int rating, String comment) {
		this.keyResults = keyResults;
		this.rating = rating;
		this.comment = comment;
	}

}

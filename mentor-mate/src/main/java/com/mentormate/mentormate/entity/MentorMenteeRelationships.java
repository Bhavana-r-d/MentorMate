package com.mentormate.mentormate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MentorMenteeRelationships {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long relationshipId;

    @ManyToOne
    @JoinColumn(name = "mentor_id")
    private Mentors mentor;

    @ManyToOne
    @JoinColumn(name = "mentee_id")
    private Mentees mentee;

}

package com.mentormate.mentormate.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private String designation;

	// byte array for BLOB.
	@Lob
	@Column(name = "profilePicture", columnDefinition = "BLOB")
	private byte[] profilePicture;

	// Collection of roles associated with the user
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
	@Column(name = "role") // Specify the column name for roles
	private List<String> roles;

	public Users(String email, String firstName, String lastName, String password, String designation,
			List<String> roles, byte[] profilePicture) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.designation = designation;
		this.roles = roles;
		this.profilePicture = profilePicture;
	}

	// Helper method to add a role to the roles list
	public void addRole(String role) {
		if (roles == null) {
			roles = new ArrayList<String>();
		}
		roles.add(role);
	}

}
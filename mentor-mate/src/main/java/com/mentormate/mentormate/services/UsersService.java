package com.mentormate.mentormate.services;

import java.util.List;
import javax.management.relation.RoleNotFoundException;
import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.models.UsersModel;

public interface UsersService {

	// Get all users from the database
	List<Users> getAllUsers();
	// Create a new user based on the provided user model
	// Throws RoleNotFoundException if the specified role is not found
	Users createUsers(UsersModel usersModel) throws RoleNotFoundException;

	boolean isUserExists(String email);

	Users findByEmail(String username);

	Users updateUsers(UsersModel usersModel);

	Users getUserById(long userId);
}

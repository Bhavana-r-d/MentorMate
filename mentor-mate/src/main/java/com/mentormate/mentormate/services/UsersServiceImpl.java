package com.mentormate.mentormate.services;

import java.util.List;
import javax.management.relation.RoleNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.models.UsersModel;
import com.mentormate.mentormate.repositories.UsersRepository;

//Service implementation for handling user-related operations
@Service
public class UsersServiceImpl implements UsersService {

	// Injecting UsersRepository dependency

	@Autowired
	private UsersRepository usersRepository;

	// Retrieve all users from the database
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public List<Users> getAllUsers() {
		return usersRepository.findAll();
	}

	// Create a new user based on the provided user model
	// Throws RoleNotFoundException if the specified role is not found
	@Override
	public Users createUsers(UsersModel usersModel) throws RoleNotFoundException {

		Users existingUser = usersRepository.findByEmail(usersModel.getEmail());

		// Check if a user with the given email already exists
		if (existingUser != null) {
			throw new RuntimeException("User with the provided email already exists");

		}
		// Create a new Users entity using the data from the UsersModel
		Users user = new Users(usersModel.getEmail(), StringUtils.capitalize(usersModel.getFirstName()),
				usersModel.getLastName(), passwordEncoder.encode(usersModel.getPassword()), usersModel.getDesignation(),
				usersModel.getRoles(), usersModel.getProfilePicture());

		// Save the new user to the database
		return usersRepository.save(user);
	}

	@Override
	public boolean isUserExists(String email) {
		// Check if a user with the given email already exists in the database
		return usersRepository.findByEmail(email) != null;
	}

	@Override
	public Users findByEmail(String username) {
		return usersRepository.findByEmail(username);
	}

	@Override
	public Users getUserById(long userId) {
		return usersRepository.getReferenceById(userId);
	}

	// Fetches a user record based on userId
	@Override
	public Users updateUsers(UsersModel usersModel) {
		Users user = new Users(usersModel.getEmail(), StringUtils.capitalize(usersModel.getFirstName()),
				usersModel.getLastName(), passwordEncoder.encode(usersModel.getPassword()), usersModel.getDesignation(),
				usersModel.getRoles(), usersModel.getProfilePicture());

		return usersRepository.save(user);
	}

}

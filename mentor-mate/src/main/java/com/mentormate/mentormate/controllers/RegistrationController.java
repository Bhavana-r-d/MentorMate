package com.mentormate.mentormate.controllers;

import javax.management.relation.RoleNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mentormate.mentormate.models.UsersModel;
import com.mentormate.mentormate.services.UsersService;

@Controller
public class RegistrationController {
	// Autowired annotation for injecting UsersService dependency
	@Autowired
	private UsersService usersService;

// Autowired annotation for injecting PasswordEncoder dependency
	@Autowired
	PasswordEncoder passwordEncoder;

// Handle the POST request for user registration
	@PostMapping("/registration")
	public String registerUser(@ModelAttribute("user") UsersModel usersModel, Model model)
			throws RoleNotFoundException {

		try {
			// Check if the user with the given email already exists
			if (usersService.isUserExists(usersModel.getEmail())) {
				model.addAttribute("error", "User with this email already exists.");
				return "registration";
			}

			// Check if the entered password matches the confirmed password
			if (usersModel.getPassword().equals(usersModel.getConfirmPassword())) {
				// Create a new user based on the provided user model
				usersService.createUsers(usersModel);
				// Redirect to the login page after successful registration
				return "redirect:/login";
			} else {
				// Set an error message for displaying a password mismatch message
				model.addAttribute("error", "Password did not match");
				// Return the registration page to correct the password mismatch
				return "registration";
			}
		} catch (RuntimeException e) {
			// Log the exception for debugging purposes
			e.printStackTrace();

			// Add an error message for the user
			model.addAttribute("error", "An error occurred during registration. Please try again.");

			// Return to the registration page with the error message
			return "registration";
		}
	}

// Handle the GET request to show the registration form
	@GetMapping("/registration")
	public String showRegistrationForm(Model model) {
		// Add an empty user model to be populated in the form
		model.addAttribute("user", new UsersModel());
		return "registration";
  }

		// Handle the GET request to show the login form
		@GetMapping("/login")
		public String showLoginForm() {
			// Return the login page view
			return "login";
		}
}

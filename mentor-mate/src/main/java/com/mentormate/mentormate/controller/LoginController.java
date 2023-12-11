package com.mentormate.mentormate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.model.LoginModel;
import com.mentormate.mentormate.service.UserService;

@Controller

public class LoginController {
	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String showLoginForm(Model model) {
		List<Users> registeredUsers = userService.getAllRegisteredUsers();

		model.addAttribute("registeredUsers", registeredUsers);
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}

	@PostMapping("/login")
	public String loginUser(@ModelAttribute("loginModel") LoginModel loginModel, Model model) {
		Users user = userService.loginUser(loginModel);

		if (user != null) {
			// User found, redirect to a dashboard or home page
			return "redirect:/dashboard";
		} else {
			// User not found or incorrect credentials, show an error message
			model.addAttribute("error", "Invalid email or password");
			return "redirect:/dashboard";
		}
	}

	@GetMapping("/dashboard")
	//@ResponseBody
	public String showLoginForm() {

		return "dashboard";
	}

}

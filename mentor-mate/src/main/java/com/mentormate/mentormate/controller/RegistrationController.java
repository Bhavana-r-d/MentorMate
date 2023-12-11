package com.mentormate.mentormate.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.model.User;
import com.mentormate.mentormate.repositories.UserRepository;
import com.mentormate.mentormate.service.UserService;


@Controller
public class RegistrationController {
//	
//	@Autowired
//	private UserRepository repo;
//	private final  UserService userService;
	
//	@Autowired
//    public RegistrationController(UserService userService) {
//        this.userService = userService;
//    }
	
	@Autowired
	private UserService userService;
	
	

    @GetMapping("/registration")
    public String showRegistrationForm() {
        // Create a new User object and add it to the model
//        model.addAttribute("user", new User());
        return "registration";
    }

//    @PostMapping("/registration")
//    public String registerUser(@ModelAttribute("user") User user,Model model) {
////        System.out.println(user);
////    	User users = new User();
////        repo.save(users);
//        // Implement registration logic here
//        // Save the user to the database, perform validation, etc.
//        return "redirect:login"; // Redirect to the login page after successful registration
//    }
    
//    
//    @ModelAttribute("user")
//    public String User user(){
//    	return new Users();
//    }
    @PostMapping("/registration")
    public String registerUser(@ModelAttribute User user,Model model) {
    	//String email, String name, String password, Set<String> roles, String confirmpassword
    	System.out.println(user.toString());
    	userService.createUser(new Users(user.getEmail(),user.getName(), user.getPassword(),user.getRoles(),user.getConfirmPassword()));
		model.addAttribute("message", "User Registration Successful... Please Login to Proceed.");
        // Your registration logic
        return "redirect:/login";
    }
   
    
//    @PostMapping("/register")
//    public String registerUser(@ModelAttribute("user") User user, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            // If there are validation errors, return to the registration form
//            return "registration";
//        }

        // Perform the registration logic
//        try {
//            userService.registerUser(user);
//        } catch (RegistrationException e) {
//            // Handle registration exception (e.g., duplicate email, database error)
//            bindingResult.rejectValue("email", "error.user", e.getMessage());
//            return "registration";
//        }

        // Redirect to the login page after successful registration
//        return "redirect:/login";
//    }
    
//    @GetMapping("/login")
//    @ResponseBody
//    public String showLoginForm() {
//    	
//    	return "login";
//    }
}

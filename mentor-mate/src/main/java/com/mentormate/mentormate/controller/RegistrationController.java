
package com.mentormate.mentormate.controller;
 
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.mentormate.mentormate.entities.Roles;
import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.model.User;
import com.mentormate.mentormate.repositories.UserRepository;
import com.mentormate.mentormate.service.UserService;
 
@Controller
 
//@RequestMapping("/registration")
public class RegistrationController {
	@Autowired
	private UserService userService;
 
	@GetMapping("/registration")
	public String showRegistrationForm() {
		// Create a new User object and add it to the model
		return "registration";
	}
 
	@PostMapping("/registration")
	public String registerUser(@ModelAttribute User user, Model model) {
		System.out.println(user.toString());
		userService.createUser(new Users(user.getEmail(), user.getName(), user.getPassword(), user.getConfirmPassword(),
				user.getRoles()));
		model.addAttribute("message", "User Registration Successful... Please Login to Proceed.");
		// Your registration logic
		
//		   // Validate password matching
//        if (!user.getPassword().equals(user.getConfirmPassword())) {
//            model.addAttribute("error", "Passwords do not match");
//            return "registration";
//        }
//
//        // Your other registration logic here
//        userService.registerUser(user);

		return "redirect:/login";
		
	}
//	@ModelAttribute("user")
//	public  User user() {
//		return new User();
//	}
//	@PostMapping
//public String registerUser(@ModelAttribute("user") User user) {
//	userService.save(user);
//	return "redirect:/registration";
//}
	@GetMapping("/login")
	@ResponseBody
	public String showLoginForm() {
		return "login";
	}
}
 
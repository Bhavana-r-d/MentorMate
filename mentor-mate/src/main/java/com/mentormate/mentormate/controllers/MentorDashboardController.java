package com.mentormate.mentormate.controllers;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mentormate.mentormate.dto.OkrDTO;
import com.mentormate.mentormate.entities.Objectives;
import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.services.OKRService;
import com.mentormate.mentormate.services.UsersService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MentorDashboardController {
	// Get the mentor dashboard page

	@Autowired
	UsersService usersService;

	@Autowired
	OKRService okrService;

	@GetMapping("/mentor")
	public String mentorDashboard(Model model) {
		org.springframework.security.core.Authentication authentication = SecurityContextHolder.getContext()
				.getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			String currentUserName = authentication.getName();
			Users currentUser = usersService.findByEmail(currentUserName);
			
			model.addAttribute("firstName", currentUser.getFirstName());
			model.addAttribute("userId", currentUser.getId());
			model.addAttribute("mentor", currentUser);
		}
		return "mentor";
		
	}

	@PostMapping("/save")
	public String saveOKR(@ModelAttribute OkrDTO okrForm, @ModelAttribute("objective") String objective,
			@ModelAttribute("keyResult1") String keyResult1, @ModelAttribute("keyResult2") String keyResult2) {
		
		org.springframework.security.core.Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();
        Users currentUser = usersService.findByEmail(currentUserName);
        Long userId = currentUser.getId();
        Objectives savedObjective =  okrService.saveObjective(usersService.getUserById(userId), objective);
        okrService.saveKeyResult(savedObjective, keyResult1);
        okrService.saveKeyResult(savedObjective, keyResult2);
        return "redirect:/mentor";
	}
}

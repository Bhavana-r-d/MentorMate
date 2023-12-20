package com.mentormate.mentormate.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.models.UsersModel;
import com.mentormate.mentormate.services.MentorMenteeRelationshipService;
import com.mentormate.mentormate.services.UsersService;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MenteeDashboardController {

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private UsersService usersService;

	@Autowired
	private MentorMenteeRelationshipService mentorMenteeRelationshipService;

	@GetMapping("/mentee")
	public String menteeDashboard(HttpServletRequest request, Model model) {
		// get the firstName of the user
		String firstName = request.getParameter("firstName");
		// get the user Id of the user
		Long userId = Long.valueOf(request.getParameter("userId"));
		// Fetching profile information
		Users mentee = usersService.getUserById(userId);
		UsersModel menteeModel = new UsersModel(mentee);

		// Fetching List of Mentees under a Mentor
		List<UsersModel> listOfMentees = new ArrayList<>();
		Users mentor = mentorMenteeRelationshipService.getMentorForMentee(mentee);
		// Fetches Mentor of the mentee logged in, then the list of mentees under that
		// mentor, using mentor-mentee-realtionship table
		List<Users> listOfUsers = mentorMenteeRelationshipService.getMenteesForMentor(mentor);
		if (listOfUsers != null) {
			listOfMentees = listOfUsers.stream().map(u -> new UsersModel(u)).toList();
		}
	
		model.addAttribute("listOfMentees", listOfMentees);

		model.addAttribute("firstName", firstName);
		model.addAttribute("mentee", menteeModel);

		// Return the mentee dashboard view
		return "mentee";
	}

}

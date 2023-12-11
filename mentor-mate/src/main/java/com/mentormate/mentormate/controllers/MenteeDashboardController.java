package com.mentormate.mentormate.controllers;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mentormate.mentormate.entities.MentorMenteeRelationship;
import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.models.UsersModel;
import com.mentormate.mentormate.services.UsersService;

@Controller
public class MenteeDashboardController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/menteeDashboard")
	public String viewMenteeProfile(Model model) {
		
		//Static value for testing, Get menteeId of the mentee Logged in
		Users mentee = usersService.getUserById(3);
		UsersModel menteeModel = new UsersModel(mentee);
		model.addAttribute("mentee",menteeModel);
		
		usersService.createMentorMenteeRelationship(new MentorMenteeRelationship(usersService.getUserById(1), usersService.getUserById(3)));
		usersService.createMentorMenteeRelationship(new MentorMenteeRelationship(usersService.getUserById(1), usersService.getUserById(4)));
		model.addAttribute("listOfMentees",usersService.getMenteesForMentor(usersService.getMentorForMentee(mentee)).stream().map(u -> new UsersModel(u)).collect(Collectors.toList()));
		return "/menteeDashboard";
	}
}

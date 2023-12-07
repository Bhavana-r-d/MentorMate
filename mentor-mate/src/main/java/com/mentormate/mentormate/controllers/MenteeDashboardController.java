package com.mentormate.mentormate.controllers;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mentormate.mentormate.models.UsersModel;
import com.mentormate.mentormate.services.UsersService;

@Controller
public class MenteeDashboardController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/menteeDashboard")
	public String viewMenteeProfile(Model model) {
		UsersModel user = new UsersModel(usersService.getUserById(1));
		model.addAttribute("mentee",user);
		
		//IMPLEMENT MENTOR-MENTEE RELATIONSHIP SERVICE
//		model.addAttribute("listOfMentees",usersService.getAllByMentor().stream().map(u -> new UsersModel(u)).collect(Collectors.toList()));
		return "/menteeDashboard";
	}
}

package com.mentormate.mentormate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.mentormate.mentormate.services.UsersService;

@Controller
public class MenteeDashboardController {
	
	@Autowired
	private UsersService usersService;
	
//	public String listOrders(Model model) {
//		model.addAttribute("mentee",orderService.getAll().stream().map(o -> new OrderModel(o)).collect(Collectors.toList()));
//		return "orders/list";
//	}
	@GetMapping("/menteeDashboard")
	public String viewMenteeProfile(Model model) {
		model.addAttribute("mentee",usersService.getUserById(1));
		return "menteeDashboard";
	}
}

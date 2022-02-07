package com.bigbell.spring.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigbell.spring.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {
	private Log logger = LogFactory.getLog(UserController.class);
	
	@GetMapping("/create-user")
	public String ShowCreateUserPage(ModelMap model) {
		model.addAttribute("user", new User());
		return "user";
	}
	
	@PostMapping("/create-user")
	public String addToDo(User user) {
		logger.info("User Detail " + user);
		return "redirect:list-users";
	}
	
	@GetMapping("/list-user")
	public String ShowAllUsers() {
		return "list-users";
	}
}

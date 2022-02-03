package com.bigbell.spring.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bigbell.spring.entity.User;

@Controller
public class UserController2 {
	private Log logger = LogFactory.getLog(UserController2.class);
	
	@GetMapping("/create-user-with-validation")
	public String ShowCreateUserPage(ModelMap model) {
		model.addAttribute("user", new User());
		return "user";
	}
	
	@PostMapping("/create-user-with-validation")
	public String addToDo(@Valid User user, BindingResult result) {
		
		if (result.hasErrors()) {
			return "user";
		}
		
		logger.info("user details " + user);
		
		return "redirect:list-user-with-validation";
	}
	
	@GetMapping("/list-user-with-validation")
	public String ShowAllUsers() {
		return "list-users";
	}
}

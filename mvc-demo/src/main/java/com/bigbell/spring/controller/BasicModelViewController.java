package com.bigbell.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicModelViewController {
	
	@RequestMapping("welcome-model-view")
	public ModelAndView welcome(ModelMap model) {
		model.addAttribute("name", "Spring");
		return new ModelAndView("welcome-model-view", model);
	}
}

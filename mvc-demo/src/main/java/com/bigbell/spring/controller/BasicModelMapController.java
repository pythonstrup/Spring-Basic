package com.bigbell.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicModelMapController {
	
	@RequestMapping("welcome-model-map")
	public String welcome(ModelMap model) {
		model.addAttribute("name", "Spring");
		return "welcome-model-map";
	}
}

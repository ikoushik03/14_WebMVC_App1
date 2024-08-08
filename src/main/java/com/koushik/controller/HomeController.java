package com.koushik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "My name is koushik");
		mav.setViewName("index");
		return mav;
	}
}

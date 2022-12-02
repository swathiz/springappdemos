package com.samples.s08springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello") //--> tells the url
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello"); // to tell to wch view it has to go ie.e hello.jsp
		
		modelAndView.addObject("id", 567);
		modelAndView.addObject("name", "Ken");
		modelAndView.addObject("salary", 60000);
		
		return modelAndView;
	}
	
}
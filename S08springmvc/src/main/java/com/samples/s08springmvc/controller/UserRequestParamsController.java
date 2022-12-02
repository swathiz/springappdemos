package com.samples.s08springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserRequestParamsController {

	@RequestMapping(value = "/showdata")
	public ModelAndView showdata(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value="salary", required = false, defaultValue = "1000") int salary) {

		//using @requestparam we are giving values for the variables
		//and we are giving required = false stating that it is not compulsory to enter that variable in url while running
		//for that we have to set some default value so that it will give that value when are not givng any value
		//so use defaultvalue="100"
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);

		ModelAndView mv = new ModelAndView();
		mv.addObject("id", id);
		mv.addObject("name", name);
		mv.addObject("salary", salary);
		mv.setViewName("hello");

		return mv;

	}

}


//To RUN this : in chrome paste this url  "http://localhost:8080/S08springmvc/showdata?id=999&name=alex&salary=678"
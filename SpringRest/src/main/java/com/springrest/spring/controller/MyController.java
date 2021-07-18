package com.springrest.spring.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.spring.model.Course;

@RestController
public class MyController {
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to my project";
	}
	
	//Get all the courses
	
	@GetMapping("/courses")
	public List<Course> getAllCourse()
	{
		return null;
		
	}

}

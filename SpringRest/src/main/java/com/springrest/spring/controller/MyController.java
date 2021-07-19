package com.springrest.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.spring.model.Course;
import com.springrest.spring.service.ICourseService;

@RestController
public class MyController {

	@Autowired
	private ICourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to my project";
	}

	// Get all the courses

	@GetMapping("/courses")
	public List<Course> getAllCourse() {

		return courseService.getAllCourse();

	}

}

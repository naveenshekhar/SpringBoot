package com.springrest.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.springrest.spring.model.Course;

public class CourseServiceImpl implements ICourseService{
	
	
	public List<Course> list;
	
	//Constructor to initialize list Variable 
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		
		list.add(new Course(1, "Java", "Learning java..!!"));
		list.add(new Course(2, "Python", "This course contains basics of python "));
		
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return list;
	
	}

}

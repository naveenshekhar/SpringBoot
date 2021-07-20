package com.springrest.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.spring.model.Course;

@Service
public class CourseServiceImpl implements ICourseService {

	public List<Course> list;

	// Constructor to initialize list Variable
	public CourseServiceImpl() {

		list = new ArrayList<>();

		list.add(new Course(1, "Java", "Learning java..!!"));
		list.add(new Course(2, "Python", "This course contains basics of python "));

	}

	@Override
	public List<Course> getAllCourse() {
		System.out.println("<<<<<<<<<(2.)CourseServiceImpl :: LIST>>>>>>>> :" + list);
		// TODO Auto-generated method stub
		return list;

	}

}

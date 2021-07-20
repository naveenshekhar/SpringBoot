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
		System.out.println("<<<<<<<<<<<(2.) CourseServiceImpl :: LIST>>>>>>>>>>> :" + list);
		return list;
	}

	@Override
	public Course getCourse(long id) {
		
		

		Course c = null;

		for (Course course : list) {

			if (course.getId() == id) {
				c = course;
				break;
			}

		}
		
		System.out.println("<<<<<<<<<<<(2.) CourseServiceImpl :: Course>>>>>>>>>>> :" + c);

		return c;
	}

}

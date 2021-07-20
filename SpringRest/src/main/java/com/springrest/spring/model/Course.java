package com.springrest.spring.model;

public class Course {

	private long id;
	private String title;
	private String discription;

	// Constructor
	public Course(long id, String title, String discription) {
		super();
		this.id = id;
		this.title = title;
		this.discription = discription;
	}

	// Constructor using super class

	public Course() {
		super();
	
	}

	// ToString
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", discription=" + discription + "]";
	}

	// Getter Setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

}

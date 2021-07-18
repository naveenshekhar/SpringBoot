package com.springrest.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sun.xml.bind.v2.model.core.ID;

public interface ICourseDao extends JpaRepository<Long, ID>{
	
	

}

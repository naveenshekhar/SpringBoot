package com.naveen.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.springboot.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

	
}

package com.naveen.springboot.service;

import java.util.List;

import com.naveen.springboot.model.Employee;

public interface IEmployeeService {
	
	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);

	void deleteEmployeeById(long id);

}

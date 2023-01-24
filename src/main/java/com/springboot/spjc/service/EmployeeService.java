package com.springboot.spjc.service;

import java.util.List;

import com.springboot.spjc.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(Integer id);
	
	void deleteEmployee(Integer id);
}

package com.springboot.spjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.spjc.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

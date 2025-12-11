package com.emp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	 

	

}

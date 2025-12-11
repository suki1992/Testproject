package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.Employee;
import com.emp.service.EmployeeService;

@RestController
public class EmplloyeeController {
	@Autowired
	private EmployeeService empService; 
	@PostMapping("/addUser")
	public Employee createEmployee(@RequestBody Employee emp)
	{
		return empService.createEmployee(emp);
		
	}
	@GetMapping("/getDetails")
	public List<Employee> getEmployee()
	{
		return empService.fetchEmployee();
		
	}
	@GetMapping("/getDetails")
	public List<Employee> getEmployees()
	{
		return empService.fetchEmployee();
		
	}

}

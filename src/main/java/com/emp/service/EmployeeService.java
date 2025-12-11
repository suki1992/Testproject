package com.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.dao.EmployeeRepository;
import com.emp.entity.Employee;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	
	public Employee createEmployee(Employee emp)
	{
		return empRepo.save(emp);
		
	}
	public List<Employee> fetchEmployee() 
	{
		return empRepo.findAll();
		
	}
	public Employee updateById(Employee emp)
	{
		Employee olddata=null;
		Optional<Employee>  optionalEmp=empRepo.findById(emp.getEmpId());
		if(optionalEmp.isPresent())
		{
		    olddata=optionalEmp.get();
			olddata.setEmpName(emp.getEmpName());
			olddata.setCourse(emp.getCourse());
			empRepo.save(olddata);
		}
		else
		{
			return new Employee();
		}
		return olddata;
		
	}

}

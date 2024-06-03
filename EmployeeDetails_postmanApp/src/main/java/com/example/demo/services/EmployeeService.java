package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepos;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepos employeeRepos;
	
	public Employee saveDetails(Employee employee) 
	{	
		return employeeRepos.save(employee);	
	}
	
	public Employee getEmployeeDetailsById(int id) 
	{
		return  employeeRepos.findById(id).orElse(null);
	}
	
	public String getDeleteById(int id) 
	{
	 employeeRepos.deleteById(id);
	 return "deleted Sucessfully=" + id;
	}
	
	public List<Employee> getAllDetails() 
	{
		return employeeRepos.findAll();
	}
}


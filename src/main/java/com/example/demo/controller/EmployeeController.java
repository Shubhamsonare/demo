package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public Employee addemp(@RequestBody Employee employee)
	{
		return this.employeeService.create(employee);
	}
	
	@GetMapping
	public ResponseEntity<?> getEmp()
	{
		return this.employeeService.get();
	}
	@GetMapping("{id}")
	public ResponseEntity<?> getByIdEmp(@PathVariable String id)
	{
		return this.employeeService.getById(id);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable String id)
	{
		return this.employeeService.delete(id);
		
	}
	@PutMapping("{id}")
	public Employee updateEmp( @PathVariable String id, @RequestBody Employee emp)
	{
		return this.employeeService.update(id, emp);
		
	}
	
	
}

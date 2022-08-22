package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	Employee create(Employee employee);
	
	ResponseEntity<?> get();
	
	ResponseEntity<?> getById(String id);
	
	Employee update(String id, Employee employee);
	
	ResponseEntity<String> delete(String id);
}

package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee create(Employee employee) {
		
			return this.employeeRepository.save(employee);
		
	}

	@Override
	public ResponseEntity<?> get(){
		
		return ResponseEntity.ok(this.employeeRepository.findAll());
		
		
	}

    @Override
	public ResponseEntity<?> getById(String id) {	
    	return ResponseEntity.ok(employeeRepository.findById(id));
    	
	}

	@Override
	public Employee update(String id, Employee employee) {
		
		Optional<Employee> FindById = this.employeeRepository.findById(id);
		Employee emp=null;
		if(FindById.isPresent())
		{
			emp=FindById.get();
			emp.setEname(employee.getEname());
			emp.setRole(employee.getRole());
			
			
		}
		return this.employeeRepository.save(emp);
		
	}

	@Override
	public ResponseEntity<String> delete(String id) {
		
		Optional<Employee> findbyid=this.employeeRepository.findById(id);
		if(findbyid.isPresent())
		{
			Employee emp=findbyid.get();
			this.employeeRepository.delete(emp);
			return ResponseEntity.ok("Record Deleted");
		}
		return ResponseEntity.ok("Record not Avaliable");
	}
}

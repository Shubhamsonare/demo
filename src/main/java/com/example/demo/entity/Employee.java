package com.example.demo.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="emp")
public class Employee implements Serializable {

	@Id
	private String id;
	
	private String ename;
	private String role;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Employee(String id, String ename, String role) {
		super();
		this.id = id;
		this.ename = ename;
		this.role = role;
	}
	public Employee() {
		super();
		
	}
	
	
	
	
	
}

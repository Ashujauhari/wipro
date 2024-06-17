package com.ducat.springboot.aop.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	// Dummy values for an employee!
	private int id = 1001;
	private String name = "Alex";

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
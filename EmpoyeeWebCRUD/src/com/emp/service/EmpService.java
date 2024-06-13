package com.emp.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface EmpService {
	public void getEmployees(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException; 
}

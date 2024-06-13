package com.emp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/EmployeeController")

import com.emp.service.EmpService;
import com.emp.service.EmpServiceImpl;
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmpService es=null;
	public void init()
	{
		//-----Access the connection  parameters from web.xml from web.xml 
		 String jdbcURL = getServletContext().getInitParameter("jdbcURL");
	        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
	        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
	        System.out.println("In controller :"+jdbcURL + jdbcUsername+ jdbcPassword);
	        
	        es= new EmpServiceImpl(); 
	}				
	
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//http://localhost:3002/EmpoyeeWebCRUD/EmployeeController - getContextPath() is EmployeeWebCRUD
		String action = request.getServletPath();
		System.out.println(action);		
		  switch (action) {
		  case "/" :
	        	System.out.println(" I am from action"+action);
	           	es.getEmployees(request, response);; //Call method from service layer
	        	RequestDispatcher dispatcher = request.getRequestDispatcher("EmpList.jsp");
	    	    dispatcher.forward(request, response);
	        }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}

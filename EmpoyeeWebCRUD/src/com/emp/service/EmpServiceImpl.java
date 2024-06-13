package com.emp.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.dao.EmpDAO;
import com.emp.dao.EmpDAOImpl;
import com.emp.model.Employee;

public class EmpServiceImpl  implements EmpService{
	//Create Object of EmpDAO;
	EmpDAOImpl edo=null;
	public EmpServiceImpl() {
	 edo=new EmpDAOImpl();
	}

	@Override
	public void getEmployees(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List< Employee> emplist=edo.listAllEmployees();
		System.out.println(emplist);
		request.setAttribute("emplist", emplist);
		RequestDispatcher dispatcher = request.getRequestDispatcher("EmpList.jsp");
	    dispatcher.forward(request, response);
		
	}

}

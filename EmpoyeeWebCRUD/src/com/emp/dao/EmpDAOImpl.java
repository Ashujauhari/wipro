package com.emp.dao;

import java.util.ArrayList;
import java.util.List;

import com.emp.model.Employee;

public class EmpDAOImpl implements EmpDAO {
	String jdbcURL ;
	String jdbcUsername ;
	String Password ;
	String jdbcPassword;
	
	public EmpDAOImpl() {};
	
	public EmpDAOImpl(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		System.out.println("In DAO : + url: "+ jdbcURL + "username :"+jdbcUsername +"Password : "+jdbcPassword);
		this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
        //System.out.println("jdbc :"+jdbcURL);
    }
	
	@Override
	public List<Employee> listAllEmployees() {
		List< Employee> el= new ArrayList<>();
		el.add(new Employee(100,"Arushi",10000));
		el.add(new Employee(200,"Himanshi",20000));
		return el;
	}

}


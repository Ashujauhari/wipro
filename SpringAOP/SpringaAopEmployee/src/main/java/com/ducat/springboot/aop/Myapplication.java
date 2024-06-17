package com.ducat.springboot.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.ducat.springboot.aop.model.Employee;

@SpringBootApplication
// @EnableAspectJAutoProxy annotation enables support for handling the components marked with @Aspect annotation. 
//It is similar to <aop:aspectj-autoproxy> tag in the xml configuration.
@EnableAspectJAutoProxy
public class Myapplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Myapplication.class, args);

		// Fetching the employee object from the application context.
		Employee myemployee = context.getBean(Employee.class);

		// Displaying employee details.
		System.out.println("Employee id= " + myemployee.getId());

		System.out.println("Employee name= " + myemployee.getName());

		// Closing the context object.
		context.close();
	}
}
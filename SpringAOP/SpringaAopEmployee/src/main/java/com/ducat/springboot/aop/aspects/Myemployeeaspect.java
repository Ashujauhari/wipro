package com.ducat.springboot.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// @Aspect annotation enables the spring aop functionality in an application. 
//Tells the developer that this class has advice methods.
@Aspect
@Component
//Join points are the options on the menu and pointcuts are the items you select
public class Myemployeeaspect {

	// Pointcut definition to display all the available methods i.e. the advice will be called for all the methods.
	@Pointcut(value= "execution(* com.ducat.springboot.aop.model.Employee.*(..))")
	private void displayEmployee(){ }

	// Method is executed before the method matching with a pointcut expression.
	@Before(value= "displayEmployee()")
	
	public void beforeAdvice(JoinPoint jp){
		System.out.println("Inside beforeAdvice() method...." + " Inserted before= " + jp.getSignature().getName() + " method");
	}  
}
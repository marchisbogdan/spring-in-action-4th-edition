package com.action.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CarComputerAspect {
	
	@Pointcut("@annotation(com.action.aop.interfaces.ExampleAOPUsageInterface)")
	public void annotationExampleAOPUsageInterfacePointCutDefinition(){}
	
	@Pointcut("execution(* *(..))")
	public void atExecution(){}

	//@Before("execution(* com.action.models.Car.startStopCar(..))")
	@Before("annotationExampleAOPUsageInterfacePointCutDefinition() && atExecution()")
	public void logCarStartAdvice(JoinPoint joinPoint){
		System.out.println("AOP AD: Starting the car....");
	}
	
	
	//@After("execution(* com.action.models.Car.startStopCar(..))")
	@After("annotationExampleAOPUsageInterfacePointCutDefinition() && atExecution()")
	public void logCarStopAdvice(JoinPoint joinPoint){
		System.out.println("AOP AD: Stopping the engine of the car....");
	}
}

package com.action.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CarComputerAspect {
	
	@Pointcut("@annotation(ExampleAOPUsageInterface)")
	public void annotationExampleAOPUsageInterfacePointCutDefinition(){}

	//@Before("execution(* com.action.models.Car.startStopCar(..))")
	@Before("annotationExampleAOPUsageInterfacePointCutDefinition()")
	public void logCarStartAdvice(JoinPoint joinPoint){
		System.out.println("AOP: Starting the car....");
	}
	
	
	//@After("execution(* com.action.models.Car.startStopCar(..))")
	@After("annotationExampleAOPUsageInterfacePointCutDefinition()")
	public void logCarStopAdvice(JoinPoint joinPoint){
		System.out.println("AOP: Stopping the engine of the car....");
	}
}

package com.action.aop.aspect;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
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
	
	@Around("annotationExampleAOPUsageInterfacePointCutDefinition() && atExecution()")
	public void calculateTimePerformance(ProceedingJoinPoint joinPoint){
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Started the performance test for method:"+joinPoint.toLongString()+" at time:"+ldt.toString());
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		LocalDateTime ldt2 = LocalDateTime.now();
		System.out.println("Stopped the performance test for method:"+joinPoint.toLongString()+" at time:"+ldt2.toString());
		System.out.println("Time elapsed:"+ChronoUnit.MILLIS.between(ldt,ldt2)+ " ms");
	}
}

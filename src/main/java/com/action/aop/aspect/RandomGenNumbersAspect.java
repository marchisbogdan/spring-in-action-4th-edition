package com.action.aop.aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RandomGenNumbersAspect {
	private Map<Integer,Integer> randomNumbersMap = new HashMap<Integer, Integer>();
	
	@Pointcut("execution(* *.RandomNumberGenerator.printGeneratedRandomNumber(*))")
	private void randomNumberCounter(){}
	
	@Pointcut(value="args(value)",argNames="value")
	private void valueArg(Integer value){}
	
	@Before("randomNumberCounter()")
	public void count(JoinPoint jp){
		Integer value = 0;
		System.out.println("asd"+value);
		Integer countValue = getCountForValue(value);
		randomNumbersMap.put(value, countValue + 1);
	}
	
	public Integer getCountForValue(Integer value){
		return randomNumbersMap.containsKey(value) ? randomNumbersMap.get(value) : 0; 
	}
}

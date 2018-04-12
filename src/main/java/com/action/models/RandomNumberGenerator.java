package com.action.models;

import java.security.SecureRandom;

import org.springframework.stereotype.Component;

import com.action.models.interfaces.RandomNumberGenInterface;

@Component
public class RandomNumberGenerator implements RandomNumberGenInterface {
	
	private SecureRandom sr;
	
	public RandomNumberGenerator() {
		super();
		sr = new SecureRandom();
	}

	@Override
	public void generateRandomNumbers(int count,int maxValue) {
		for(int i=1; i<=count; i++){
			Integer value = generateRandomNumber(maxValue);
			printGeneratedRandomNumber(value);
		}
	}
	
	private void printGeneratedRandomNumber(Integer value) {
		//System.out.println("Generated Number:"+value.toString());
	}

	private Integer generateRandomNumber(int maxValue){
		return sr.nextInt(maxValue);
		
	}
}

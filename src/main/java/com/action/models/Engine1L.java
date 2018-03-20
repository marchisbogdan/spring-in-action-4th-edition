package com.action.models;

import org.springframework.stereotype.Component;

import com.action.models.interfaces.IEngine;

@Component
public class Engine1L implements IEngine{
	
	private int power;
	private int capacity;
	
	public Engine1L() {
		super();
	}

	public Engine1L(int power, int capacity) {
		this.power = power;
		this.capacity = capacity;
	}

	@Override
	public int getPower() {
		return this.power;
	}

	@Override
	public int getCapacity() {
		return this.capacity;
	}
	
	

}

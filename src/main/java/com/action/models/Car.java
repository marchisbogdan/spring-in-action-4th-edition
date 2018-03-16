package com.action.models;

import com.action.models.interfaces.IEngine;

public class Car {
	private String name;
	private IEngine engine;
	private int power;
	private int capacity;
	
	public Car(String name, IEngine engine) {
		super();
		this.name = name;
		this.engine = engine;
		this.power = engine.getPower();
		this.capacity = engine.getCapacity();
	}
	
	public String getName() {
		return name;
	}
	public IEngine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + ", power=" + power + ", capacity=" + capacity + "]";
	}
	
}

package com.action.models;

import com.action.aop.interfaces.ExampleAOPUsageInterface;
import com.action.models.interfaces.IEngine;

public class Car {
	private String name;
	private IEngine engine;
	private int power;
	private int capacity;
	private CarComputer carComputer;
	
	public Car(String name, IEngine engine, CarComputer carComputer) {
		super();
		this.name = name;
		this.engine = engine;
		this.power = engine.getPower();
		this.capacity = engine.getCapacity();
		this.carComputer = carComputer;
	}
	
	public String getName() {
		return name;
	}
	public IEngine getEngine() {
		return engine;
	}
	
	@ExampleAOPUsageInterface
	public void startStopCar() {
		carComputer.logStartCarMessage();
		System.out.println("Car started...");
		carComputer.logStopCarMessage();
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + ", power=" + power + ", capacity=" + capacity + "]";
	}
	
}

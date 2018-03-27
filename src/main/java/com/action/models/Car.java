package com.action.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.action.aop.interfaces.ExampleAOPUsageInterface;
import com.action.models.interfaces.IEngine;

@Component
public class Car {
	@Value("${car.name}")
	private String name;
	private IEngine engine;
	private int power;
	private int capacity;
	
	@Autowired
	private CarComputer carComputer;
	
	public Car() {
		super();
	}

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

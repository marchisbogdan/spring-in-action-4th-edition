package com.action.models;

import com.action.models.interfaces.Institution;

public class Library implements Institution{

	private String name;
	
	@Override
	public void enter() {
		System.out.println("Welcome to the "+name);
		
	}

	public void setName(String name) {
		this.name = name;
	}
}

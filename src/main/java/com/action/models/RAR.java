package com.action.models;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.action.models.interfaces.Institution;

@Component
public class RAR implements Institution,InitializingBean {

	private static final String name = "RAR";
	
	public RAR() {
		super();
	}
	
	@Override
	public void enter() {
		System.out.println("Welcome to the "+ name);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("******* Properties have been set for class " +RAR.class.getName());
	}

}

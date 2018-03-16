package com.action;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.action.config.CarConfig;
import com.action.models.Car;
import com.action.models.Library;


public class Main {

	//private static ApplicationContext context;
	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		context = new AnnotationConfigApplicationContext();
		context.register(CarConfig.class);
		context.refresh();
		
		Library library = (Library) context.getBean("library");
		System.out.println(library.someLibraryMethod());
		
		Car carFiat = (Car) context.getBean(Car.class);
		System.out.println(carFiat.toString());

	}
	
	@Override
	protected void finalize() throws Throwable {
	
		super.finalize();
	}

}

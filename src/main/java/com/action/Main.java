package com.action;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.action.config.InstitutionsConfig;
import com.action.models.Car;
import com.action.models.RAR;


public class Main {

	//private static ApplicationContext context;
	private static AnnotationConfigApplicationContext context;

	
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		context = new AnnotationConfigApplicationContext();
		context.register(InstitutionsConfig.class);
		context.refresh();
		
		RAR rar = (RAR) context.getBean(RAR.class);
		rar.enter();
		System.out.println();

		Car carFiat = (Car) context.getBean(Car.class);
		System.out.println(carFiat.toString());
		carFiat.startStopCar();
		System.out.println();

	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

}

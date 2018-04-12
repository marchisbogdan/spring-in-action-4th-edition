package com.action;

import java.util.concurrent.ForkJoinPool;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.action.aop.aspect.RandomGenNumbersAspect;
import com.action.config.InstitutionsConfig;
import com.action.models.Car;
import com.action.models.Library;
import com.action.models.RAR;
import com.action.models.RandomNumberGenerator;
import com.action.services.ArrayParallelSum;


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
		
		Library library = (Library) context.getBean(Library.class);
		library.enter();
		
		Car carFiat = (Car) context.getBean(Car.class);
		System.out.println(carFiat.toString());
		carFiat.startStopCar();
		System.out.println();
		
		RandomNumberGenerator rng = (RandomNumberGenerator) context.getBean(RandomNumberGenerator.class);
		rng.generateRandomNumbers(100, 10);
		RandomGenNumbersAspect rgna = (RandomGenNumbersAspect) context.getBean(RandomGenNumbersAspect.class);
		for(int i=0; i<10;i++){
			Integer count = rgna.getCountForValue(i);
			System.out.println("Value:" +i+ " Count:"+count);
		}
		
		int[] arr= new int[100];
		for(int i = 1; i<100; i++){
			arr[i]=i;
		}
		
		ArrayParallelSum aps = new ArrayParallelSum(arr);
		ForkJoinPool fjp = new ForkJoinPool(4);
		int sum = fjp.invoke(aps);
		System.out.println("Final sum:"+sum);
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

}

package com.action.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.action.aop.aspect.CarComputerAspect;
import com.action.models.Car;
import com.action.models.CarComputer;
import com.action.models.Engine1L;
import com.action.models.Library;
import com.action.models.interfaces.IEngine;

@Configuration
@EnableAspectJAutoProxy
public class CarConfig {
	
	@Bean
	public Car car(){
		return new Car("Fiat",engine1L(),carComputer());
	}
	
	@Bean
	public IEngine engine1L(){
		return new Engine1L(65, 1);
	}
	
	@Bean
	public Library library(){
		return new Library("Alexandria");
	}
	
	@Bean
	public CarComputer carComputer(){
		return new CarComputer("AnroidOS");
	}
	
	@Bean
	public CarComputerAspect carComputerAspect(){
		return new CarComputerAspect();
	}
}

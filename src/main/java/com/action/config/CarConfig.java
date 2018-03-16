package com.action.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.action.models.Car;
import com.action.models.Engine1L;
import com.action.models.Library;
import com.action.models.interfaces.IEngine;

@Configuration
public class CarConfig {
	
	@Bean
	public Car car(){
		return new Car("Fiat",engine1L());
	}
	
	@Bean
	public IEngine engine1L(){
		return new Engine1L(65, 1);
	}
	
	@Bean
	public Library library(){
		return new Library("Alexandria");
	}
}

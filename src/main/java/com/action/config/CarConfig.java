package com.action.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class CarConfig {
	
//	@Bean
//	public Car car(){
//		return new Car("Fiat",engine1L(),carComputer());
//	}
//	
//	@Bean
//	public IEngine engine1L(){
//		return new Engine1L(65, 1);
//	}
//	
//	@Bean
//	public CarComputer carComputer(){
//		return new CarComputer("AnroidOS");
//	}
//	
//	@Bean
//	public CarComputerAspect carComputerAspect(){
//		return new CarComputerAspect();
//	}
}

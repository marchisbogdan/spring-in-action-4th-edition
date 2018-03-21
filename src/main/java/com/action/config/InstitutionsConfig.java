package com.action.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.action.models","com.action.aop"})
@Import(CarConfig.class)
@ImportResource("classpath:spring-beans.xml")
//@ComponentScan(basePackageClasses=RAR.class)
public class InstitutionsConfig {

}

package com.action.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.action.models","com.action.aop"})
//@ComponentScan(basePackageClasses=RAR.class)
public class InstitutionsConfig {

}

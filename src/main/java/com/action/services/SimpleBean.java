package com.action.services;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.validation.ValidationUtils;

/**
 * The following class describes what the instantiation and the destruction of a Spring Bean looks like 
 * 
 * */

// 1. Spring instantiates the bean
@Component
public class SimpleBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,BeanPostProcessor,InitializingBean,DisposableBean{

	private int justANumber;
	private String justAString;
	
	@Autowired
	private ValidationUtils validationUtils;
	
	
	
	public SimpleBean(int justANumber, String justAString, ValidationUtils validationUtils) {
		// 2. First the properties of the class and the class references a set
		super();
		this.justANumber = justANumber;
		this.justAString = justAString;
		this.validationUtils = validationUtils;
	}

	@Override
	public void setBeanName(String name) {
		// 3. the setBeanName method of the @BeanNameAware interface is called (if it is implemented)
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// 4. the setBeanFactory method of the @BeanFactoryAware interface is called (if it is implemented)
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// 5. the setApplicationContext method of the @ApplicationContextAware interface is called (if it is implemented)
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// 6. the postProcessBeforeInitialization method of the @BeanPostProcessor interface is called (if it is implemented)
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// 7. the afterPropertiesSet method of the @InitializingBean interface is called (if it is implemented)
		// TODO Auto-generated method stub
	}
	
	@PostConstruct
	public void init() {
		// 8. the init method is called
	}
	

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// 9. the postProcessAfterInitialization method of the @BeanPostProcessor interface is called (if it is implemented)
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() throws Exception {
		// 10. the destroy method of the @DisposableBean interface is called when the AplicationContext is destroyed
		// TODO Auto-generated method stub
		
	}

}

package com.action.models;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class CarComputer {
	
	private String model;
	
	public void logStartCarMessage(){
		System.out.println(model+": Starting the car....");
	}
	
	public void logStopCarMessage(){
		System.out.println(model+": Closing the engine of the car....");
	}

	public CarComputer() {
		super();
	}

	public CarComputer(String model) {
		super();
		this.model = model;
	}
	
	@PostConstruct
	public void init(){
		this.model = "Android";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarComputer other = (CarComputer) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	

}

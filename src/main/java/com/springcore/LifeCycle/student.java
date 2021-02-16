package com.springcore.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class student implements InitializingBean,DisposableBean{  //Using init and despos in class without using xml file
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "student [name=" + name + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception { //for init
		// TODO Auto-generated method stub
		
		System.out.println("taking init");
		
	}

	@Override
	public void destroy() throws Exception {     // for despose
		// TODO Auto-generated method stub
		
		System.out.println("taking despos");
	}
	

}

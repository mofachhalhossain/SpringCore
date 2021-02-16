package com.springcore.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/LifeCycle/LCconfig.xml");
		//AbstractApplicationContext for registering shutdown hook
		person p = (person)context.getBean("person");
		System.out.println(p);
		
		context.registerShutdownHook(); //shutdown hook initialization
		
		student s = (student)context.getBean("student");
		System.out.println(s);

	}

} 

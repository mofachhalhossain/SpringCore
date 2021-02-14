package com.springcore.ReferenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ReferenceInjection/refconfig.xml");
		A temp =(A)context.getBean("aref");
		System.out.println("Value of A "+temp.getX());
		System.out.println("Value of B "+temp.getOb().getY());
		System.out.println(temp.getClass());
	}

}

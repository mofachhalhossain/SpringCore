package com.springcore.CollectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext testcontext = new ClassPathXmlApplicationContext("com/springcore/CollectionInjection/collectionconfig.xml");
		
		Emp emp1 = (Emp)testcontext.getBean("Emp1");
		System.out.println(emp1);
	}

}

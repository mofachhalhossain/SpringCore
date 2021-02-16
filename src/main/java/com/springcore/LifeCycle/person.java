package com.springcore.LifeCycle;

public class person {
	
	private double id;

	public double getId() {
		return id;
	}

	public void setId(double id) {
		System.out.println("Setting property");
		this.id = id;
	}

	public person() {
		super();
	}

	@Override
	public String toString() {
		return "person [id=" + id + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");  
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}

}

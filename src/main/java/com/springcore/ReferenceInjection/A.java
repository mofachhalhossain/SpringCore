package com.springcore.ReferenceInjection;

public class A {
	
	private String x;
	private B ob;
	
	
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}

}

package com.spring.bean;

public class FactoryA  implements Printable{
	private static final FactoryA facA= new FactoryA();
	
	private FactoryA() {
		System.out.println("Private FactoryA constructor called");
	}
	public static FactoryA getFactoryA() {
		System.out.println("FactoryA method");
		return facA;
	}
	
	public void msg(){  
	    System.out.println("hello user");  
	}
	
	@Override
	public void print() {
		System.out.println("hello FactoryA printable method");
		
	}  
}

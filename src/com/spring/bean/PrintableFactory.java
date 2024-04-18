package com.spring.bean;

public class PrintableFactory {
	//static method
	public static Printable getPrintable() {
		return new FactoryB();
	}
	
	//instance method
	public  Printable getInstancePrintable() {
		return new FactoryB();
	}

}

package com.spring.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {

		/*
		 * Bean factory ioc container example
		 * 
		 * Resource rs=new ClassPathResource("applicationContext.xml"); BeanFactory
		 * bf=new XmlBeanFactory(rs);
		 */
		System.out.println("Dependency Injection by Consturtor example");
		System.out.println("===========================================");
		System.out.println();
		ApplicationContext apc = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stu = (Student) apc.getBean("student");
		stu.displayInfo();

		ApplicationContext apc1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stu1 = (Student) apc1.getBean("student3");
		stu1.show();
		System.out.println();
		System.out.println("Dependency Injection by setter example");
		System.out.println("===========================================");
		System.out.println();
		ApplicationContext apc2 = new ClassPathXmlApplicationContext("applicationContextSetter.xml");
		Student stu2 = (Student) apc2.getBean("student");
		stu2.displayInfo();

		ApplicationContext apc3 = new ClassPathXmlApplicationContext("applicationContextSetter.xml");
		Student stu3 = (Student) apc3.getBean("student3");
		stu3.show();

		System.out.println();
		System.out.println("Dependency Injection by factory static method");
		System.out.println("===========================================");
		System.out.println();
		System.out.println("Dependency Injection by factory static method that returns the instance of same class.");

		ApplicationContext apc4 = new ClassPathXmlApplicationContext("applicationContextFactory.xml");
		FactoryA fac = (FactoryA) apc4.getBean("facA");
		fac.msg();
		System.out.println();
		System.out.println("Dependency Injection by factory static method that returns the instance of another class.");
		Printable p = (Printable) apc4.getBean("printable");
		p.print();
		System.out.println();
		System.out.println(
				"Dependency Injection by factory non-static method that returns the instance of another class.");
		Printable p1 = (Printable) apc4.getBean("instancePrintable");
		p1.print();
	}

}

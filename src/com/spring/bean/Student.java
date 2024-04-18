package com.spring.bean;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private Address address;
	private List<String> subjects;
	private List<Book> books;
	private Map<String, String> queAns;
	private Map<Question, Answer> queAns2;

	
	public Student() {
		super();
	}

	// Dependency Injection by Constructor injecting primitive & string-based values
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Dependency Injection by Constructor Injection with Dependent Object
	public Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	// Constructor Injection with Collection List Example
	public Student(int id, String name, Address address, List<String> subjects) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.subjects = subjects;
	}

	// Constructor Injection with Non-String Collection (having Dependent Object)
	// Example
	public Student(int id, String name, Address address, List<String> subjects, List<Book> books) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.subjects = subjects;
		this.books = books;
	}

//Constructor Injection with Map Example
	public Student(int id, String name, Address address, List<String> subjects, List<Book> books, Map<String, String> queAns) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.subjects = subjects;
		this.books = books;
		this.queAns = queAns;
	}

//Dependency Injection by  Constructor Injecting with Non-String Map (having dependent Object) Example 

	public Student(int id, String name, Address address, List<String> subjects, List<Book> books, Map<String, String> queAns,
			Map<Question, Answer> queAns2) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.subjects = subjects;
		this.books = books;
		this.queAns = queAns;
		this.queAns2 = queAns2;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Map<String, String> getQueAns() {
		return queAns;
	}

	public void setQueAns(Map<String, String> queAns) {
		this.queAns = queAns;
	}

	public Map<Question, Answer> getQueAns2() {
		return queAns2;
	}

	public void setQueAns2(Map<Question, Answer> queAns2) {
		this.queAns2 = queAns2;
	}

	public void displayInfo() {
		System.out.println("Hello :" + name + " My id is: " + id);
		System.out.println(address.toString());
		System.out.println("Subjects are");
		Iterator<String> itr = subjects.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		System.out.println("Student books name & author is: ");
		Iterator<Book> itr1 = books.iterator();
		while (itr1.hasNext()) {
			Book book = itr1.next();
			System.out.println(book.toString());
		}
		System.out.println("Student questions & answers are : ");

		Set<Entry<String, String>> set = queAns.entrySet();
		Iterator<Entry<String, String>> itr3 = set.iterator();
		while (itr3.hasNext()) {
			Entry<String, String> entry = itr3.next();
			System.out.println(" Question is : " + entry.getKey() + " \n Answer is :" + entry.getValue());
		}

		System.out.println("Most IMP questions & answers are : ");

		Set<Entry<Question, Answer>> queans2 = queAns2.entrySet();
		Iterator<Entry<Question, Answer>> itr4 = queans2.iterator();
		while (itr4.hasNext()) {
			Entry<Question, Answer> entry = itr4.next();
			Question q1 = entry.getKey();
			Answer ans1 = entry.getValue();
			System.out.println(" Question is : " + q1 + " \n Answer is :" + ans1);
		}
	}

	public void show() {
		System.out.println("Hello :" + name + " My id is: " + id);
		System.out.println(address.toString());
	}
}

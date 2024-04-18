package com.spring.bean;

public class Book {
	private String bname;
	private String author;
	

	public Book() {
		super();
	}

	public Book(String bname, String author) {
		this.bname = bname;
		this.author = author;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString() {
		return bname + " :: " + author;
	}
}

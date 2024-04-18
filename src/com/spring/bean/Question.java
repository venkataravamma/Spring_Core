package com.spring.bean;

public class Question {
	

	private String question;
	

	public Question() {
		super();
	}

	public Question(String que) {
		question = que;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "question is " + question;
	}

}

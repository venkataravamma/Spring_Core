package com.spring.bean;

public class Answer {

	private String answer;

	public Answer() {
		super();
	}

	public Answer(String ans) {
		answer = ans;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer is " + answer;
	}

}

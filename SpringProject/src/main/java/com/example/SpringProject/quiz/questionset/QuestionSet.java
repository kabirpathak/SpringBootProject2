package com.example.SpringProject.quiz.questionset;

public class QuestionSet {
	
	private String question;
	private String[] options;
	private String answer;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public QuestionSet(String question, String[] options, String answer) {
		super();
		this.question = question;
		this.options = options;
		this.answer = answer;
	}
	
	public QuestionSet() {
		
	}
	
	

}

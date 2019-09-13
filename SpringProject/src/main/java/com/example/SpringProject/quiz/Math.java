package com.example.SpringProject.quiz;

import java.util.List;

import com.example.SpringProject.quiz.questionset.QuestionSet;

public class Math {
	
//	private List<QuestionSet> mathQuestion;
//
//	public List<QuestionSet> getMathQuestion() {
//		return mathQuestion;
//	}
//
//	public void setMathQuestion(List<QuestionSet> mathQuestion) {
//		this.mathQuestion = mathQuestion;
//	}
//
//	public Math(List<QuestionSet> mathQuestion) {
//		super();
//		this.mathQuestion = mathQuestion;
//	}
	
	private QuestionSet[] questionSetsMaths;
	
	public QuestionSet[] getQuestionSetsMaths() {
		return questionSetsMaths;
	}

	public void setQuestionSetsMaths(QuestionSet[] questionSetsMaths) {
		this.questionSetsMaths = questionSetsMaths;
	}
	

	public Math(QuestionSet[] questionSetsMaths) {
		super();
		this.questionSetsMaths = questionSetsMaths;
	}

	public Math() {
		
	}

}

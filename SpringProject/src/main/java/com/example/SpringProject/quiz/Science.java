package com.example.SpringProject.quiz;

import java.util.List;

import com.example.SpringProject.quiz.questionset.QuestionSet;

public class Science {
	
//	private List<QuestionSet> scienceQuestion;
//
//	public List<QuestionSet> getScienceQuestion() {
//		return scienceQuestion;
//	}
//
//	public void setScienceQuestion(List<QuestionSet> scienceQuestion) {
//		this.scienceQuestion = scienceQuestion;
//	}
//
//	public Science(List<QuestionSet> scienceQuestion) {
//		super();
//		this.scienceQuestion = scienceQuestion;
//	}
	
	private QuestionSet[] questionSetsScience;
	
	
	public QuestionSet[] getQuestionSetsScience() {
		return questionSetsScience;
	}

	public void setQuestionSetsScience(QuestionSet[] questionSetsScience) {
		this.questionSetsScience = questionSetsScience;
	}
	
	
	public Science(QuestionSet[] questionSetsScience) {
		super();
		this.questionSetsScience = questionSetsScience;
	}

	public Science() {
		
	}

}
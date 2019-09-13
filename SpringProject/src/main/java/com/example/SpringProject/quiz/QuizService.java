package com.example.SpringProject.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringProject.quiz.questionset.QuestionSet;

@Service
public class QuizService {
	
	String[] optionsone = {"kabir", "sumit", "naval", "neel"};
	String[] optionstwo = {"human", "noone", "man", "woman"};
	String answerone = "kabir";
	String answertwo = "human";
	
	QuestionSet qs1 = new QuestionSet("What is your name?", optionsone, answerone);
	QuestionSet qs2 = new QuestionSet("Who are you?", optionstwo, answertwo);
	
//	List<QuestionSet> mathQuestion = new ArrayList(Arrays.asList(qs1, qs2));
//	List<QuestionSet> scienceQuestion = new ArrayList(Arrays.asList(qs1));

	QuestionSet[] mathQuestions = {qs1, qs2};
	QuestionSet[] scienceQuestions = {qs2};
	
	
	Math mathTopicQuestions = new Math(mathQuestions);
	Science scienceTopicQuestions = new Science(scienceQuestions);
	
	Quiz myQuiz = new Quiz(mathTopicQuestions, scienceTopicQuestions);
	
	

	
	
	public Quiz getQuiz() {
		return myQuiz;
		
		
	}





	

}

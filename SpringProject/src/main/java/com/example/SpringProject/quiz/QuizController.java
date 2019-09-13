package com.example.SpringProject.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {
	
	@Autowired
	QuizService quizservice;
	
	
	@RequestMapping("/")
	public Quiz getQuiz() {
		return quizservice.getQuiz();
	}
	
//	@RequestMapping(method=RequestMethod.POST, value="/")
//	public void addQuiz(Quiz quiz) {
//		quizservice.addQuiz(@RequestBody quiz);
//	}

	
}

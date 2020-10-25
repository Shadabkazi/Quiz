package com.skaz.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skaz.quiz.model.Quiz;
import com.skaz.quiz.service.QuizService;

import io.swagger.annotations.ApiOperation;

@RestController("/api/quiz")
public class QuizController {
	
	@Autowired
	private QuizService quizService;

	@RequestMapping(method = RequestMethod.GET, value = "/")
	@ApiOperation(value = "Find all quiz irrespective of category")
	public List<Quiz> allQuiz() {
		return quizService.getAllQuiz();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ApiOperation(value = "Find a quiz using id")
	public Quiz allQuiz(@PathVariable Long id) {
		return quizService.getQuizById(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	@ApiOperation(value = "Add a new quiz")
	public Quiz addQuiz(Quiz quiz) {
		return quizService.saveQuiz(quiz);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	@ApiOperation(value = "Update a quiz")
	public Quiz updateQuiz(Quiz quiz) {
		return quizService.saveQuiz(quiz);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/category/{id}")
	@ApiOperation(value = "Find all quiz irrespective of category")
	public List<Quiz> allQuizByCategory(@PathVariable Long id) {
		return quizService.getQuizByCategory(id);
	}
	
}

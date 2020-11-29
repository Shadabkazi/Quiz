package com.skaz.quiz.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skaz.quiz.model.Quiz;
import com.skaz.quiz.service.QuizService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class QuizController {
	
	@Autowired
	private QuizService quizService;

	@GetMapping("/api/quiz")
	@ApiOperation(value = "Find all quiz irrespective of category")
	public List<Quiz> allQuiz() {
		return quizService.getAllQuiz();
	}
	
	@GetMapping("/api/quiz/{id}")
	@ApiOperation(value = "Find a quiz using id")
	public Optional<Quiz> allQuiz(@PathVariable String id) {
		return quizService.getQuizById(Long.parseLong(id));
	}
	
	
	@PostMapping("/api/quiz")
	@ApiOperation(value = "Add a new quiz")
	public Quiz addQuiz(Quiz quiz) {
		return quizService.saveQuiz(quiz);
	}
	
	@PutMapping("/api/quiz")
	@ApiOperation(value = "Update a quiz")
	public Quiz updateQuiz(Quiz quiz) {
		return quizService.saveQuiz(quiz);
	}
	
	
	@GetMapping("/api/quiz/category/{id}")
	@ApiOperation(value = "Find all quiz irrespective of category")
	public List<Quiz> allQuizByCategory(@PathVariable Long id) {
		return quizService.getQuizByCategory(id);
	}
	
}

package com.skaz.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skaz.quiz.model.Question;
import com.skaz.quiz.service.QuestionService;

import io.swagger.annotations.ApiOperation;

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;

	@GetMapping("/api/question")
	@ApiOperation(value = "Find all questions")
	public List<Question> allQuestion() {
		return questionService.getAllQuestions();
	}
	
	@GetMapping("/api/question/{id}")
	@ApiOperation(value = "Find a question using id")
	public Question allQuestion(@PathVariable Long id) {
		return questionService.getQuestionById(id);
	}
	
	
	@PostMapping("/api/question")
	@ApiOperation(value = "Add a new question")
	public Question addQuestion(Question question) {
		return questionService.saveQuestion(question);
	}
	
	@PutMapping("/api/question")
	@ApiOperation(value = "Update a question")
	public Question updateQuestion(Question question) {
		return questionService.saveQuestion(question);
	}
	
}

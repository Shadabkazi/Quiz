package com.skaz.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skaz.quiz.model.Question;
import com.skaz.quiz.service.QuestionService;

import io.swagger.annotations.ApiOperation;

@RestController("/api/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;

	@RequestMapping(method = RequestMethod.GET, value = "/")
	@ApiOperation(value = "Find all question irrespective of question")
	public List<Question> allQuestion() {
		return questionService.getAllQuestions();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ApiOperation(value = "Find a question using id")
	public Question allQuestion(@PathVariable Long id) {
		return questionService.getQuestionById(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	@ApiOperation(value = "Add a new question")
	public Question addQuestion(Question question) {
		return questionService.saveQuestion(question);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	@ApiOperation(value = "Update a question")
	public Question updateQuestion(Question question) {
		return questionService.saveQuestion(question);
	}
	
}

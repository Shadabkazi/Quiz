package com.skaz.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skaz.quiz.model.Choice;
import com.skaz.quiz.service.ChoiceService;

import io.swagger.annotations.ApiOperation;

@RestController("/api/choice")
public class ChoiceController {
	
	@Autowired
	private ChoiceService choiceService;

	@RequestMapping(method = RequestMethod.GET, value = "/")
	@ApiOperation(value = "Find all choice irrespective of choice")
	public List<Choice> allChoice() {
		return choiceService.getAllChoices();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ApiOperation(value = "Find a choice using id")
	public Choice allChoice(@PathVariable Long id) {
		return choiceService.getChoiceById(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	@ApiOperation(value = "Add a new choice")
	public Choice addChoice(Choice choice) {
		return choiceService.saveChoice(choice);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	@ApiOperation(value = "Update a choice")
	public Choice updateChoice(Choice choice) {
		return choiceService.saveChoice(choice);
	}
	
}

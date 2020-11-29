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

import com.skaz.quiz.model.Choice;
import com.skaz.quiz.service.ChoiceService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ChoiceController {
	
	@Autowired
	private ChoiceService choiceService;

	@GetMapping("/api/choice")
	@ApiOperation(value = "Find all choices")
	public List<Choice> allChoice() {
		return choiceService.getAllChoices();
	}
	
	@GetMapping("/api/choice/{id}")
	@ApiOperation(value = "Find a choice using id")
	public Optional<Choice> allChoice(@PathVariable Long id) {
		return choiceService.getChoiceById(id);
	}
	
	
	@PostMapping("/api/choice")
	@ApiOperation(value = "Add a new choice")
	public Choice addChoice(Choice choice) {
		return choiceService.saveChoice(choice);
	}
	
	@PutMapping("/api/choice")
	@ApiOperation(value = "Update a choice")
	public Choice updateChoice(Choice choice) {
		return choiceService.saveChoice(choice);
	}
	
}

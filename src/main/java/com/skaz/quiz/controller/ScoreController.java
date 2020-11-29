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

import com.skaz.quiz.model.Score;
import com.skaz.quiz.service.ScoreService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;

	@GetMapping("/api/score")
	@ApiOperation(value = "Find all score")
	public List<Score> allScore() {
		return scoreService.getAllScores();
	}
	
	@GetMapping("/api/score/{id}")
	@ApiOperation(value = "Find a score using id")
	public Optional<Score> allScore(@PathVariable Long id) {
		return scoreService.getScoreById(id);
	}
	
	
	@PostMapping("/api/score")
	@ApiOperation(value = "Add a new score")
	public Score addScore(Score score) {
		return scoreService.saveScore(score);
	}
	
	@PutMapping("/api/score")
	@ApiOperation(value = "Update a score")
	public Score updateScore(Score score) {
		return scoreService.saveScore(score);
	}
	
}

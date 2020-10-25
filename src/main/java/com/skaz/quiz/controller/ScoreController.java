package com.skaz.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skaz.quiz.model.Score;
import com.skaz.quiz.service.ScoreService;

import io.swagger.annotations.ApiOperation;

@RestController("/api/score")
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;

	@RequestMapping(method = RequestMethod.GET, value = "/")
	@ApiOperation(value = "Find all score irrespective of score")
	public List<Score> allScore() {
		return scoreService.getAllScores();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ApiOperation(value = "Find a score using id")
	public Score allScore(@PathVariable Long id) {
		return scoreService.getScoreById(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	@ApiOperation(value = "Add a new score")
	public Score addScore(Score score) {
		return scoreService.saveScore(score);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	@ApiOperation(value = "Update a score")
	public Score updateScore(Score score) {
		return scoreService.saveScore(score);
	}
	
}

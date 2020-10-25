package com.skaz.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skaz.quiz.model.Score;
import com.skaz.quiz.repository.ScoreRepository;

@Service
public class ScoreService {

	@Autowired
	private ScoreRepository scoreRepository;
	
	public List<Score> getAllScores(){
		return scoreRepository.findAll();
	}
	
	public Score getScoreById(Long id) {
		return scoreRepository.getOne(id);
	}
	
	public Score saveScore(Score score) {
		return scoreRepository.save(score);
	}
	
	public boolean deleteScore(Score score) {
		try {
			scoreRepository.delete(score);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}

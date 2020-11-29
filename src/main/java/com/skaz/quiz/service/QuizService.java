package com.skaz.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skaz.quiz.model.Quiz;
import com.skaz.quiz.repository.QuizRepository;

@Service
public class QuizService {

	@Autowired
	private QuizRepository quizRepository;
	
	public List<Quiz> getAllQuiz(){
		return quizRepository.findAll();
	}
	
	public Optional<Quiz> getQuizById(Long id) {
		return quizRepository.findById(id);
	}
	
	public List<Quiz> getQuizByCategory(Long id) {
		return quizRepository.findByCategory(id);
	}
	
	public Quiz saveQuiz(Quiz quiz) {
		return quizRepository.save(quiz);
	}
	
	public boolean deleteQuiz(Quiz quiz) {
		try {
			quizRepository.delete(quiz);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}

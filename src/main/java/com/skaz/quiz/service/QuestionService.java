package com.skaz.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skaz.quiz.model.Question;
import com.skaz.quiz.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;
	
	public List<Question> getAllQuestions(){
		return questionRepository.findAll();
	}
	
	public Question getQuestionById(Long id) {
		return questionRepository.getOne(id);
	}
	
	public Question saveQuestion(Question question) {
		return questionRepository.save(question);
	}
	
	public boolean deleteQuestion(Question question) {
		try {
			questionRepository.delete(question);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}

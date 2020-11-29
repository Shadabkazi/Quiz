package com.skaz.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skaz.quiz.model.Choice;
import com.skaz.quiz.repository.ChoiceRepository;

@Service
public class ChoiceService {

	@Autowired
	private ChoiceRepository choiceRepository;
	
	public List<Choice> getAllChoices(){
		return choiceRepository.findAll();
	}
	
	public Optional<Choice> getChoiceById(Long id) {
		return choiceRepository.findById(id);
	}
	
	public Choice saveChoice(Choice choice) {
		return choiceRepository.save(choice);
	}
	
	public boolean deleteChoice(Choice choice) {
		try {
			choiceRepository.delete(choice);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}

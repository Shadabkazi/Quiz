package com.skaz.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skaz.quiz.model.User;
import com.skaz.quiz.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public Optional<User> getUserById(Long id) {
		return userRepository.findById(id);
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public boolean deleteUser(User user) {
		try {
			userRepository.delete(user);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
    
}

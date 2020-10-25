package com.skaz.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skaz.quiz.model.User;
import com.skaz.quiz.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/api/user")
	@ApiOperation(value = "Find all users")
	public List<User> allUser() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/api/user/{id}")
	@ApiOperation(value = "Find a user using id")
	public User allUser(@PathVariable Long id) {
		return userService.getUserById(id);
	}
	
	
	@PostMapping("/api/user")
	@ApiOperation(value = "Add a new user")
	public User addUser(User user) {
		return userService.saveUser(user);
	}
	
	@PutMapping("/api/user")
	@ApiOperation(value = "Update a user")
	public User updateUser(User user) {
		return userService.saveUser(user);
	}
	
}

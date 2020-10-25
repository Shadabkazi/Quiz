package com.skaz.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skaz.quiz.model.User;
import com.skaz.quiz.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET, value = "/")
	@ApiOperation(value = "Find all user irrespective of user")
	public List<User> allUser() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ApiOperation(value = "Find a user using id")
	public User allUser(@PathVariable Long id) {
		return userService.getUserById(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	@ApiOperation(value = "Add a new user")
	public User addUser(User user) {
		return userService.saveUser(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	@ApiOperation(value = "Update a user")
	public User updateUser(User user) {
		return userService.saveUser(user);
	}
	
}

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

import com.skaz.quiz.model.Category;
import com.skaz.quiz.service.CategoryService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/api/category")
	@ApiOperation(value = "Find all category")
	public List<Category> allCategory() {
		return categoryService.getAllCategories();
	}
	
	@GetMapping("/api/category/{id}")
	@ApiOperation(value = "Find a category using id")
	public Optional<Category> allCategory(@PathVariable Long id) {
		return categoryService.getCategoryById(id);
	}
	
	
	@PostMapping("/api/category")
	@ApiOperation(value = "Add a new category")
	public Category addCategory(Category category) {
		return categoryService.saveCategory(category);
	}
	
	@PutMapping("/api/category")
	@ApiOperation(value = "Update a category")
	public Category updateCategory(Category category) {
		return categoryService.saveCategory(category);
	}
	
}

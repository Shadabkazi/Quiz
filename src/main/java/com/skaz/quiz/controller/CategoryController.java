package com.skaz.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skaz.quiz.model.Category;
import com.skaz.quiz.service.CategoryService;

import io.swagger.annotations.ApiOperation;

@RestController("/api/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	@RequestMapping(method = RequestMethod.GET, value = "/")
	@ApiOperation(value = "Find all category irrespective of category")
	public List<Category> allCategory() {
		return categoryService.getAllCategories();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ApiOperation(value = "Find a category using id")
	public Category allCategory(@PathVariable Long id) {
		return categoryService.getCategoryById(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	@ApiOperation(value = "Add a new category")
	public Category addCategory(Category category) {
		return categoryService.saveCategory(category);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	@ApiOperation(value = "Update a category")
	public Category updateCategory(Category category) {
		return categoryService.saveCategory(category);
	}
	
}

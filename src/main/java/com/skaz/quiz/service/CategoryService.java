package com.skaz.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skaz.quiz.model.Category;
import com.skaz.quiz.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> getAllCategories(){
		return categoryRepository.findAll();
	}
	
	public Optional<Category> getCategoryById(Long id) {
		return categoryRepository.findById(id);
	}
	
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	public boolean deleteCategory(Category category) {
		try {
			categoryRepository.delete(category);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
}

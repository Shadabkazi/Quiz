package com.skaz.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skaz.quiz.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}

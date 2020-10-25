package com.skaz.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skaz.quiz.model.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long>{

	@Query(value="select q from Quiz q where q.category= ?1")
	public List<Quiz> findByCategory(Long id);
	
}

package com.skaz.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skaz.quiz.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{

}

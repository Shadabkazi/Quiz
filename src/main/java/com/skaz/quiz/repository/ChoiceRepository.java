package com.skaz.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skaz.quiz.model.Choice;

@Repository
public interface ChoiceRepository extends JpaRepository<Choice, Long>{

}

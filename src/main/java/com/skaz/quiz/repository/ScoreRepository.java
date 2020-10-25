package com.skaz.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skaz.quiz.model.Score;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long>{

}

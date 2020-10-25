package com.skaz.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skaz.quiz.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

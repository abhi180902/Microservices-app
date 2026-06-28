package com.brave.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brave.quiz.entity.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{

}

package com.brave.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brave.quiz.entity.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{
	
}

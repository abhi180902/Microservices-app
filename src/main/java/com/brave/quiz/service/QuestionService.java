package com.brave.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brave.quiz.dao.QuestionDao;
import com.brave.quiz.entity.Question;

@Service
public class QuestionService {
	
	@Autowired
	QuestionDao questionDao;

	public List<Question> getAllQuestions() {
		
		return questionDao.findAll();
	}

	

}

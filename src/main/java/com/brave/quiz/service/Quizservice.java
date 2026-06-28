package com.brave.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.brave.quiz.dao.QuestionDao;
import com.brave.quiz.dao.QuizDao;
import com.brave.quiz.entity.Question;
import com.brave.quiz.entity.Quiz;

@Service
public class Quizservice {

	@Autowired
	QuizDao quizdao;
	
	@Autowired
	QuestionDao questionDao;

	public ResponseEntity<String> creatQuiz(String category, int numQ, String title) {
		
		List<Question> questions = questionDao.findRandomQuestionsByCategory(category, numQ);
		
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestions(questions);
		quizdao.save(quiz);
		
		return new ResponseEntity<>("Success",HttpStatus.CREATED);
	}
	
	
}

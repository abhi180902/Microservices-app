package com.brave.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brave.quiz.entity.Question;
import com.brave.quiz.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {

	@Autowired
	QuestionService questionService; 
	
	@GetMapping("allQuestions")
	public List<Question> getAllQuestions() {
		
		return questionService.getAllQuestions();
		
	}
}

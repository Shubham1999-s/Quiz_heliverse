package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.dto.QuizDto;
import com.quiz.dto.QuizResultDto;
import com.quiz.entities.Quiz;
import com.quiz.service.QuizService;

@RestController
@RequestMapping("/api/quizzes")
public class QuizRestController {
	@Autowired
	private QuizService quizService;
	@PostMapping
    public ResponseEntity<QuizDto> createQuiz(@RequestBody QuizDto quizDto) {
	     return new ResponseEntity<>(quizService.createQuiz(quizDto), HttpStatus.CREATED);
    }
	  @GetMapping("/active")
	    public ResponseEntity<QuizDto> getActiveQuiz() {
	        QuizDto activeQuiz = quizService.getActiveQuiz();
	        return ResponseEntity.ok(activeQuiz);
	    }
	  @GetMapping("/{id}/result")
	    public ResponseEntity<QuizResultDto> getQuizResult(@PathVariable("id") Long quizId) {
	        QuizResultDto quizResult = quizService.getQuizResult(quizId);
	        return ResponseEntity.ok(quizResult);
	    }
	  @GetMapping("/all")
	    public ResponseEntity<List<QuizDto>> getAllQuizzes() {
	        List<QuizDto> allQuizzes = quizService.getAllQuizzes();
	        return ResponseEntity.ok(allQuizzes);
	    }

}

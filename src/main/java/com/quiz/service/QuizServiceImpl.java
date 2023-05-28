package com.quiz.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.dto.QuizDto;
import com.quiz.dto.QuizResultDto;
import com.quiz.entities.Quiz;
import com.quiz.entities.QuizResult;
import com.quiz.repositories.QuizRepository;
import com.quiz.repositories.QuizResultRepository;

@Service
public class QuizServiceImpl implements QuizService {
	@Autowired
	private QuizRepository quizRepo;
	@Autowired
	private QuizResultRepository quizResultRepo;
	

	@Override
	public QuizDto createQuiz(QuizDto quizDto) {
		// convert DTO to entity
        Quiz quiz = mapToEntity(quizDto);
        Quiz newQuiz = quizRepo.save(quiz);
     // convert entity to DTO
        QuizDto newQuizDto = mapToDto(newQuiz);
        return newQuizDto;
		
	}
	// convert entity to DTO
	private QuizDto mapToDto(Quiz quiz) {
		 QuizDto quizDto = new QuizDto();
	        quizDto.setId(quiz.getId());
	        quizDto.setQuestion(quiz.getQuestion());
	        quizDto.setOptions(quiz.getOptions());
	        quizDto.setRightAnswer(quiz.getRightAnswer());
	        quizDto.setStartDate(quiz.getStartDate());
	        quizDto.setEndDate(quiz.getEndDate());
		return quizDto;
	}
	// convert DTO to entity
	private Quiz mapToEntity(QuizDto quizDto) {
        Quiz quiz = new Quiz();
        quiz.setId(quizDto.getId());
        quiz.setQuestion(quizDto.getQuestion());
        quiz.setOptions(quizDto.getOptions());
        quiz.setRightAnswer(quizDto.getRightAnswer());
        quiz.setStartDate(quizDto.getStartDate());
        quiz.setEndDate(quizDto.getEndDate());
        return quiz;

		 
	}
	@Override
	public QuizDto getActiveQuiz() {
		LocalDateTime currentDateTime = LocalDateTime.now();
	    Quiz activeQuiz = quizRepo.findActiveQuiz(currentDateTime);

	    if (activeQuiz != null) {
	        // Convert the Quiz entity to QuizDTO	       
	    	QuizDto quizDto = new QuizDto();
        quizDto.setId(activeQuiz.getId());
        quizDto.setQuestion(activeQuiz.getQuestion());
        quizDto.setOptions(activeQuiz.getOptions());
	        quizDto.setRightAnswer(activeQuiz.getRightAnswer());
	    	 quizDto.setStartDate(activeQuiz.getStartDate());
	    	 quizDto.setEndDate(activeQuiz.getEndDate());

	        return quizDto;
	    }

	    return null;
		 
	}
	@Override
	public QuizResultDto getQuizResult(Long quizId) {
		// Retrieve the quiz result from the database based on the quiz ID
	    QuizResult quizResult = quizResultRepo.findQuizById(quizId);

	    if (quizResult != null) {
	        // Convert the QuizResult entity to QuizResultDTO
	        QuizResultDto quizResultDto = new QuizResultDto();
	        quizResultDto.setQuizId(quizResult.getQuizId());
	        quizResultDto.setRightAnswer(quizResult.getRightAnswer());

	        return quizResultDto;
	    }

	    return null;
	}
	@Override
	public List<QuizDto> getAllQuizzes() {
		 List<Quiz> quizzes = quizRepo.findAll();
		    List<QuizDto> quizDTOs = new ArrayList<>();

		    for (Quiz quiz : quizzes) {
		        QuizDto quizDto = new QuizDto();
		        quizDto.setId(quiz.getId());
		        quizDto.setQuestion(quiz.getQuestion());
		        quizDto.setOptions(quiz.getOptions());
		        quizDto.setRightAnswer(quiz.getRightAnswer());
		        quizDto.setStartDate(quiz.getStartDate());
		        quizDto.setEndDate(quiz.getEndDate());
		         

		        quizDTOs.add(quizDto);
		    }

		    return quizDTOs;	
		 
	}
	 	 
	 
	 
	}
	 
	            
		
	
	
	 



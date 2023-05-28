package com.quiz.service;

 

 
import java.time.LocalDateTime;
import java.util.List;

import com.quiz.dto.QuizDto;
import com.quiz.dto.QuizResultDto;
import com.quiz.entities.Quiz;
public interface QuizService {

	 QuizDto createQuiz(QuizDto quizDto);

	QuizDto getActiveQuiz();

	QuizResultDto getQuizResult(Long quizId);

	List<QuizDto> getAllQuizzes();

	 

	 
 

 

}

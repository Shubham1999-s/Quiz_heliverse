package com.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entities.QuizResult;

public interface QuizResultRepository extends JpaRepository<QuizResult, Long> {

	QuizResult findQuizById(Long quizId);

}

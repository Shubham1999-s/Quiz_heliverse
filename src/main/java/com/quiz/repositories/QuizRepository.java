package com.quiz.repositories;

 

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.quiz.dto.QuizDto;
import com.quiz.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

	//Quiz findActiveQuiz(LocalDateTime currentDateTime);

	  @Query("SELECT q FROM Quiz q WHERE :currentDateTime BETWEEN q.startDate AND q.endDate")
    Quiz findActiveQuiz(@Param("currentDateTime") LocalDateTime currentDateTime);
 

}

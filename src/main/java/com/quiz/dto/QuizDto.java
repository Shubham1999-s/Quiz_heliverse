package com.quiz.dto;

 
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class QuizDto {
	private Long id;
	 private String question;
	    private List<String> options;
	    private int rightAnswer;
	    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	    private LocalDateTime startDate;
	    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	    private LocalDateTime endDate;
	     
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		public List<String> getOptions() {
			return options;
		}
		public void setOptions(List<String> options) {
			this.options = options;
		}
		public int getRightAnswer() {
			return rightAnswer;
		}
		public void setRightAnswer(int rightAnswer) {
			this.rightAnswer = rightAnswer;
		}
		public LocalDateTime getStartDate() {
			return startDate;
		}
		public void setStartDate(LocalDateTime startDate) {
			this.startDate = startDate;
		}
		public LocalDateTime getEndDate() {
			return endDate;
		}
		public void setEndDate(LocalDateTime endDate) {
			this.endDate = endDate;
		}
		 

}

package com.quiz.dto;

public class QuizResultDto {
	private Long quizId;
    private Integer rightAnswer;
	public Long getQuizId() {
		return quizId;
	}
	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}
	public Integer getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(Integer rightAnswer) {
		this.rightAnswer = rightAnswer;
	}

}

package org.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ExamQuestions")
public class ExamQuestions {
	public ExamQuestions() {
		super();
	}

	@Column(name = "examId")
	private int examId;

	@Column(name = "questionId")
	private int questionId;

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

}

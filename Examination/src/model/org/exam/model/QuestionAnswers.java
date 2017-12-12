package org.exam.model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "question_answers")
public class QuestionAnswers {
	@Column(name = "qid")
	private int questionId;

	@Column(name = "cid")
	private int choiceId;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getChoiceId() {
		return choiceId;
	}

	public void setChoiceId(int choiceId) {
		this.choiceId = choiceId;
	}

	public QuestionAnswers() {
		super();
	}

}

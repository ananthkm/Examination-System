package org.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Register")
public class ExamRegister {
	public ExamRegister() {
		super();
	}

	@Column(name = "userid")
	private int userId;

	@Column(name = "eid")
	private int examId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

}

package org.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exm_examdetails")
public class Exam {
	public Exam() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "exam_id")
	private int examId;

	@Column(name = "name")
	private String name;

	@Column(name = "pass_mark")
	private int passMark;

	@Column(name = "star_ttime")
	private String startTime;

	@Column(name = "end_time")
	private String endTime;

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassMark() {
		return passMark;
	}

	public void setPassMark(int passMark) {
		this.passMark = passMark;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}

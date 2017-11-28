package model;

import java.util.Date;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Exam_Details")
public class ExamDetails {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer qNumber;
	private Integer passMark;
	private Date startTime;
	private Date endTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getqNumber() {
		return qNumber;
	}
	public void setqNumber(Integer qNumber) {
		this.qNumber = qNumber;
	}
	public Integer getPassMark() {
		return passMark;
	}
	public void setPassMark(Integer passMark) {
		this.passMark = passMark;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	

}

package model;


import javax.persistence.Entity; 
import javax.persistence.Table;


@Entity
@Table(name="Choices")
public class Choices {
	private Integer qid;
	private String Choice;
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
	}
	public String getChoice() {
		return Choice;
	}
	public void setChoice(String choice) {
		Choice = choice;
	}
}

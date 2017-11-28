package model;

@Entity
@Table(name="question")
public class Question {
	@Column(name="qid")
	private int qid;
	@Column(name="mid")
	private int mid;
	@Column(name="question")
	private String question;
	@Column(name="category")
	private String category;
	@Column(name="answer")
	private String answer;
	

}

package model;
import javax.persistence.Entity; 
import javax.persistence.Table;

@Entity
@Table(name="Material")
public class Material {
	private Integer mid;
	private String text;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}

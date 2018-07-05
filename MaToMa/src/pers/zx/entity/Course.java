package pers.zx.entity;

import java.util.Set;

public class Course {

	private Integer CouId;
	private String CouName;
	private Set<Student>Students;
	
	public Course(){}
	public Course(Integer CouId,String CouName,Set<Student>Students){
		this.CouId=CouId;
		this.CouName=CouName;
		this.Students=Students;
	}
	public Integer getCouId() {
		return CouId;
	}
	public void setCouId(Integer couId) {
		CouId = couId;
	}
	public String getCouName() {
		return CouName;
	}
	public void setCouName(String couName) {
		CouName = couName;
	}
	public Set<Student> getStudents() {
		return Students;
	}
	public void setStudents(Set<Student> students) {
		Students = students;
	}
	
}

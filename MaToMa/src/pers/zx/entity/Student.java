package pers.zx.entity;

import java.util.Set;

public class Student {

	private Integer StuId;
	private String StuName;
	private Set<Course>Courses;
	
	public Student(){
		
	}
	
    public Student(Integer StuId,String StuName,Set<Course>Courses){
		this.StuId=StuId;
		this.StuName=StuName;
		this.Courses=Courses;
	}

	public Integer getStuId() {
		return StuId;
	}

	public void setStuId(Integer stuId) {
		StuId = stuId;
	}

	public String getStuName() {
		return StuName;
	}

	public void setStuName(String stuName) {
		StuName = stuName;
	}

	public Set<Course> getCourses() {
		return Courses;
	}

	public void setCourses(Set<Course> courses) {
		Courses = courses;
	}
    
}

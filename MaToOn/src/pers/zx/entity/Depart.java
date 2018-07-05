package pers.zx.entity;

import java.util.Set;

public class Depart {
  private Integer DepartId;
  private String DepartName;
  private String DepartMemo;
  private Set<Employee>employee;
  public Depart(){
	  
  }
  public Depart(Integer DepartId,String DepartName,String DepartMemo){
	  super();
	  this.DepartId=DepartId;
	  this.DepartName=DepartName;
	  this.DepartMemo=DepartMemo;
	
  }
public Integer getDepartId() {
	return DepartId;
}
public void setDepartId(Integer departId) {
	DepartId = departId;
}
public String getDepartName() {
	return DepartName;
}
public void setDepartName(String departName) {
	DepartName = departName;
}
public String getDepartMemo() {
	return DepartMemo;
}
public void setDepartMemo(String departMemo) {
	DepartMemo = departMemo;
}
public Set<Employee> getEmployee() {
	return employee;
}
public void setEmployee(Set<Employee> employee) {
	this.employee = employee;
}
  
  

}

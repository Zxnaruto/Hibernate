package pers.zx.entity;

public class Employee {

	private Integer EmployeeId;
	private String EmployeeName;
	private String EmployeeSex;
	private Integer EmployeeAge;
	private Depart depart;
	
public Employee(){
		
	}
	public Employee(int EmployeeId,String EmloyeeName,Integer EmployeeAge,String EmployeeSex,Depart depart){
		super();
		this.EmployeeId=EmployeeId;
		this.EmployeeName=EmloyeeName;
		this.EmployeeAge=EmployeeAge;
		this.EmployeeSex=EmployeeSex;
		this.depart=depart;
		
	}
	public Integer getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeSex() {
		return EmployeeSex;
	}
	public void setEmployeeSex(String employeeSex) {
		EmployeeSex = employeeSex;
	}
	public Integer getEmployeeAge() {
		return EmployeeAge;
	}
	public void setEmployeeAge(Integer employeeAge) {
		EmployeeAge = employeeAge;
	}
	public Depart getDepart() {
		return depart;
	}
	public void setDepart(Depart depart) {
		this.depart = depart;
	}
	
}

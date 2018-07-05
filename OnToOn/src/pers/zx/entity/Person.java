package pers.zx.entity;

public class Person {
  
	private Integer Id;
	private String Name;
	private String Age;
	private IdCard idcard;
	public Person(){
		
	}
	 public Person(Integer Id,String Name,String Age){
		 super();
		 this.Id=Id;
		 this.Name=Name;
		 this.Age=Age;
	 }
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public IdCard getIdcard() {
		return idcard;
	}
	public void setIdcard(IdCard idcard) {
		this.idcard = idcard;
	}
	 
}

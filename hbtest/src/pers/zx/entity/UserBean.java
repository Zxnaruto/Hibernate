package pers.zx.entity;

public class UserBean {

	private Integer userId;
	private String userName;
	private String userPassword;
	
	//保留默认无参构造函数
	public UserBean(){
		
	}
	public UserBean(String UserName,String UserPassword){
		super();
		this.userName=UserName;
		this.userPassword=UserPassword;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}

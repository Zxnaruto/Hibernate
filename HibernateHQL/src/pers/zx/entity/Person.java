package pers.zx.entity;

public class Person {

	private Integer PerId;
	private String PerName;
	private Integer PerAge;
	private IdCard CardId;
	
	public Person(){}
	public Person(Integer PerId,String PerName,Integer PerAge/*,Integer CardId*/){
		//this.CardId=CardId;
		this.PerAge=PerAge;
		this.PerId=PerId;
		this.PerName=PerName;
	}
	public Integer getPerId() {
		return PerId;
	}
	public void setPerId(Integer perId) {
		PerId = perId;
	}
	public String getPerName() {
		return PerName;
	}
	public void setPerName(String perName) {
		PerName = perName;
	}
	public Integer getPerAge() {
		return PerAge;
	}
	public void setPerAge(Integer perAge) {
		PerAge = perAge;
	}
	public IdCard getCardId() {
		return CardId;
	}
	public void setCardId(IdCard cardId) {
		CardId = cardId;
	}
	
	
}

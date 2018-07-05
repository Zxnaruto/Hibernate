package pers.zx.entity;

public class IdCard {

	private Integer CardId;
	private String CardName;
	private Person Person;
	
	public IdCard(){}
	public IdCard(Integer CardId,String CardName){
		this.CardId=CardId;
		this.CardName=CardName;
	}
	public Integer getCardId() {
		return CardId;
	}
	public void setCardId(Integer cardId) {
		CardId = cardId;
	}
	public String getCardName() {
		return CardName;
	}
	public void setCardName(String cardName) {
		CardName = cardName;
	}
	public Person getPerson() {
		return Person;
	}
	public void setPerson(Person person) {
		Person = person;
	}
	
}

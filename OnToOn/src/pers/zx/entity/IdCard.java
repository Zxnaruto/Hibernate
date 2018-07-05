package pers.zx.entity;

public class IdCard {

	private Integer Id;
	private String CardName;
	private Person person;
	
	public IdCard(){}
	
	public IdCard(Integer Id,String CardName){
		super();
		this.Id=Id;
		this.CardName=CardName;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getCardName() {
		return CardName;
	}

	public void setCardName(String cardName) {
		CardName = cardName;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
